package tw.nekomimi.nekogram.tlv;

import android.util.Base64;

import com.google.gson.JsonObject;

import org.telegram.tgnet.TLObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public final class TlReaders {

    public static final Map<Integer, Function<TlBinaryReader, JsonObject>>
            READERS = new HashMap<>(610);

    static {
        READERS.put(0x1fad68cd, TlReaders::readChannelAdminLogEvent);
        READERS.put(0x5806b4ec, TlReaders::readChannelAdminLogEventActionParticipantEditRank);
        READERS.put(0xc517f77e, TlReaders::readChannelAdminLogEventActionToggleAutotranslation);
        READERS.put(0x64642db3, TlReaders::readChannelAdminLogEventActionParticipantSubExtend);
        READERS.put(0x1b03f006, TlReaders::readChannelParticipantLeft);
        READERS.put(0xa2a5371e, TlReaders::readPeerChannel);
        READERS.put(0x36c6019a, TlReaders::readPeerChat);
        READERS.put(0x59511722, TlReaders::readPeerUser);
        READERS.put(0xd5f0ad91, TlReaders::readChannelParticipantBanned);
        READERS.put(0x9f120418, TlReaders::readChatBannedRights);
        READERS.put(0x34c3bb53, TlReaders::readChannelParticipantAdmin);
        READERS.put(0x5fb224d5, TlReaders::readChatAdminRights);
        READERS.put(0x2fe601d3, TlReaders::readChannelParticipantCreator);
        READERS.put(0xa9478a1a, TlReaders::readChannelParticipantSelf);
        READERS.put(0x1bd54456, TlReaders::readChannelParticipant);
        READERS.put(0x60a79c79, TlReaders::readChannelAdminLogEventActionToggleSignatureProfiles);
        READERS.put(0x46d840ab, TlReaders::readChannelAdminLogEventActionChangeEmojiStickerSet);
        READERS.put(0x1cf671a0, TlReaders::readInputStickerSetTonGifts);
        READERS.put(0x49748553, TlReaders::readInputStickerSetEmojiChannelDefaultStatuses);
        READERS.put(0x44c1f8e9, TlReaders::readInputStickerSetEmojiDefaultTopicIcons);
        READERS.put(0x29d0f5ee, TlReaders::readInputStickerSetEmojiDefaultStatuses);
        READERS.put(0x4c4d4ce, TlReaders::readInputStickerSetEmojiGenericAnimations);
        READERS.put(0xc88b3b02, TlReaders::readInputStickerSetPremiumGifts);
        READERS.put(0xcde3739, TlReaders::readInputStickerSetAnimatedEmojiAnimations);
        READERS.put(0xe67f520e, TlReaders::readInputStickerSetDice);
        READERS.put(0x28703c8, TlReaders::readInputStickerSetAnimatedEmoji);
        READERS.put(0x861cc8a0, TlReaders::readInputStickerSetShortName);
        READERS.put(0x9de7a269, TlReaders::readInputStickerSetID);
        READERS.put(0xffb62b95, TlReaders::readInputStickerSetEmpty);
        READERS.put(0x3ea9feb1, TlReaders::readChannelAdminLogEventActionChangeEmojiStatus);
        READERS.put(0x7141dbf, TlReaders::readInputEmojiStatusCollectible);
        READERS.put(0x7184603b, TlReaders::readEmojiStatusCollectible);
        READERS.put(0xe7ff068a, TlReaders::readEmojiStatus);
        READERS.put(0x2de11aae, TlReaders::readEmojiStatusEmpty);
        READERS.put(0x31bb5d52, TlReaders::readChannelAdminLogEventActionChangeWallpaper);
        READERS.put(0xe0804116, TlReaders::readWallPaperNoFile);
        READERS.put(0x372efcd0, TlReaders::readWallPaperSettings);
        READERS.put(0xa437c3ed, TlReaders::readWallPaper);
        READERS.put(0x8fd4c4d8, TlReaders::readDocument);
        READERS.put(0xfd149899, TlReaders::readDocumentAttributeCustomEmoji);
        READERS.put(0x9801d2f7, TlReaders::readDocumentAttributeHasStickers);
        READERS.put(0x15590068, TlReaders::readDocumentAttributeFilename);
        READERS.put(0x9852f9c6, TlReaders::readDocumentAttributeAudio);
        READERS.put(0x43c57c48, TlReaders::readDocumentAttributeVideo);
        READERS.put(0x6319d612, TlReaders::readDocumentAttributeSticker);
        READERS.put(0xaed6dbb2, TlReaders::readMaskCoords);
        READERS.put(0x11b58939, TlReaders::readDocumentAttributeAnimated);
        READERS.put(0x6c37c15c, TlReaders::readDocumentAttributeImageSize);
        READERS.put(0xda082fe, TlReaders::readVideoSizeStickerMarkup);
        READERS.put(0xf85c413c, TlReaders::readVideoSizeEmojiMarkup);
        READERS.put(0xde33b094, TlReaders::readVideoSize);
        READERS.put(0xd8214d41, TlReaders::readPhotoPathSize);
        READERS.put(0xfa3efb95, TlReaders::readPhotoSizeProgressive);
        READERS.put(0xe0b0bc2e, TlReaders::readPhotoStrippedSize);
        READERS.put(0x21e1ad6, TlReaders::readPhotoCachedSize);
        READERS.put(0x75c78e60, TlReaders::readPhotoSize);
        READERS.put(0xe17e23c, TlReaders::readPhotoSizeEmpty);
        READERS.put(0x36f8c871, TlReaders::readDocumentEmpty);
        READERS.put(0x5e477b25, TlReaders::readChannelAdminLogEventActionChangeProfilePeerColor);
        READERS.put(0xb8ea86a9, TlReaders::readInputPeerColorCollectible);
        READERS.put(0xb9c0639a, TlReaders::readPeerColorCollectible);
        READERS.put(0xb54b5acf, TlReaders::readPeerColor);
        READERS.put(0x5796e780, TlReaders::readChannelAdminLogEventActionChangePeerColor);
        READERS.put(0x64f36dfc, TlReaders::readChannelAdminLogEventActionToggleAntiSpam);
        READERS.put(0x5d8d353b, TlReaders::readChannelAdminLogEventActionPinTopic);
        READERS.put(0xfcdad815, TlReaders::readForumTopic);
        READERS.put(0x60fe3294, TlReaders::readDraftMessage);
        READERS.put(0xbaf39d8b, TlReaders::readRichMessage);
        READERS.put(0xfb197a65, TlReaders::readPhoto);
        READERS.put(0x2331b22d, TlReaders::readPhotoEmpty);
        READERS.put(0xe6e47c4, TlReaders::readPageBlockBlockquoteBlocks);
        READERS.put(0x9686cb50, TlReaders::readTextDiff);
        READERS.put(0xa5b45e2b, TlReaders::readTextDate);
        READERS.put(0x1a9fbfc, TlReaders::readTextMentionName);
        READERS.put(0xb956812d, TlReaders::readTextBankCard);
        READERS.put(0x24c26789, TlReaders::readTextAutoPhone);
        READERS.put(0xc556a45d, TlReaders::readTextAutoEmail);
        READERS.put(0xac6a83aa, TlReaders::readTextAutoUrl);
        READERS.put(0x7b9e1801, TlReaders::readTextCashtag);
        READERS.put(0x2ff29d3, TlReaders::readTextBotCommand);
        READERS.put(0x519524ea, TlReaders::readTextHashtag);
        READERS.put(0xcd24cf44, TlReaders::readTextMention);
        READERS.put(0x4c2a5d62, TlReaders::readTextSpoiler);
        READERS.put(0xa26156c0, TlReaders::readTextCustomEmoji);
        READERS.put(0x9d2eac97, TlReaders::readTextMath);
        READERS.put(0x35553762, TlReaders::readTextAnchor);
        READERS.put(0x81ccf4f, TlReaders::readTextImage);
        READERS.put(0x1ccb966a, TlReaders::readTextPhone);
        READERS.put(0x34b8621, TlReaders::readTextMarked);
        READERS.put(0xc7fb5e01, TlReaders::readTextSuperscript);
        READERS.put(0xed6a8504, TlReaders::readTextSubscript);
        READERS.put(0x7e6260d7, TlReaders::readTextConcat);
        READERS.put(0xde5a0dd6, TlReaders::readTextEmail);
        READERS.put(0x3c2884c1, TlReaders::readTextUrl);
        READERS.put(0x6c3f19b9, TlReaders::readTextFixed);
        READERS.put(0x9bf8bb95, TlReaders::readTextStrike);
        READERS.put(0xc12622c4, TlReaders::readTextUnderline);
        READERS.put(0xd912a59c, TlReaders::readTextItalic);
        READERS.put(0x6724abc4, TlReaders::readTextBold);
        READERS.put(0x744694e0, TlReaders::readTextPlain);
        READERS.put(0xdc3d824f, TlReaders::readTextEmpty);
        READERS.put(0x574b617f, TlReaders::readInputPageBlockMap);
        READERS.put(0x6f747657, TlReaders::readPageCaption);
        READERS.put(0x48222faf, TlReaders::readInputGeoPoint);
        READERS.put(0xe4c123d6, TlReaders::readInputGeoPointEmpty);
        READERS.put(0x3c29a3e2, TlReaders::readPageBlockThinking);
        READERS.put(0x59080c20, TlReaders::readPageBlockMath);
        READERS.put(0x682a41a9, TlReaders::readPageBlockHeading6);
        READERS.put(0xdbbe6c6a, TlReaders::readPageBlockHeading5);
        READERS.put(0xb532772b, TlReaders::readPageBlockHeading4);
        READERS.put(0x67e731ad, TlReaders::readPageBlockHeading3);
        READERS.put(0x96b2aec, TlReaders::readPageBlockHeading2);
        READERS.put(0xbaff072f, TlReaders::readPageBlockHeading1);
        READERS.put(0xa44f3ef6, TlReaders::readPageBlockMap);
        READERS.put(0xb2a2f663, TlReaders::readGeoPoint);
        READERS.put(0x1117dd5f, TlReaders::readGeoPointEmpty);
        READERS.put(0x16115a96, TlReaders::readPageBlockRelatedArticles);
        READERS.put(0xb390dc08, TlReaders::readPageRelatedArticle);
        READERS.put(0x76768bed, TlReaders::readPageBlockDetails);
        READERS.put(0x1fd6f6c1, TlReaders::readPageBlockOrderedList);
        READERS.put(0x8ff2d5f0, TlReaders::readPageListOrderedItemBlocks);
        READERS.put(0xbf4dea82, TlReaders::readPageBlockTable);
        READERS.put(0xe0c0c5e5, TlReaders::readPageTableRow);
        READERS.put(0x34566b6a, TlReaders::readPageTableCell);
        READERS.put(0x1e148390, TlReaders::readPageBlockKicker);
        READERS.put(0x804361ea, TlReaders::readPageBlockAudio);
        READERS.put(0xef1751b5, TlReaders::readPageBlockChannel);
        READERS.put(0x65efe954, TlReaders::readCommunity);
        READERS.put(0x1c6e1c11, TlReaders::readChatPhoto);
        READERS.put(0x37c1011c, TlReaders::readChatPhotoEmpty);
        READERS.put(0xfd3cdab8, TlReaders::readCommunityForbidden);
        READERS.put(0x17d493d5, TlReaders::readChannelForbidden);
        READERS.put(0xd49f34c6, TlReaders::readChannel);
        READERS.put(0x711d692d, TlReaders::readRecentStory);
        READERS.put(0xb4073647, TlReaders::readUsername);
        READERS.put(0xd072acb4, TlReaders::readRestrictionReason);
        READERS.put(0x6592a1a7, TlReaders::readChatForbidden);
        READERS.put(0x41cbf256, TlReaders::readChat);
        READERS.put(0x5b934f9d, TlReaders::readInputChannelFromMessage);
        READERS.put(0xbd2a0840, TlReaders::readInputPeerChannelFromMessage);
        READERS.put(0xa87b0a1c, TlReaders::readInputPeerUserFromMessage);
        READERS.put(0x27bcbbfc, TlReaders::readInputPeerChannel);
        READERS.put(0xdde8a54c, TlReaders::readInputPeerUser);
        READERS.put(0x35a95cb9, TlReaders::readInputPeerChat);
        READERS.put(0x7da07ec9, TlReaders::readInputPeerSelf);
        READERS.put(0x7f3b18ea, TlReaders::readInputPeerEmpty);
        READERS.put(0xf35aec28, TlReaders::readInputChannel);
        READERS.put(0xee8c1e86, TlReaders::readInputChannelEmpty);
        READERS.put(0x29562865, TlReaders::readChatEmpty);
        READERS.put(0x31f9590, TlReaders::readPageBlockSlideshow);
        READERS.put(0x65a0fa4d, TlReaders::readPageBlockCollage);
        READERS.put(0xf259a80b, TlReaders::readPageBlockEmbedPost);
        READERS.put(0xa8718dc5, TlReaders::readPageBlockEmbed);
        READERS.put(0x39f23300, TlReaders::readPageBlockCover);
        READERS.put(0x7c8fe7b6, TlReaders::readPageBlockVideo);
        READERS.put(0x1759c560, TlReaders::readPageBlockPhoto);
        READERS.put(0x4f4456d3, TlReaders::readPageBlockPullquote);
        READERS.put(0x263d7c26, TlReaders::readPageBlockBlockquote);
        READERS.put(0xe4e88011, TlReaders::readPageBlockList);
        READERS.put(0x63ca67aa, TlReaders::readPageListItemBlocks);
        READERS.put(0xce0d37b0, TlReaders::readPageBlockAnchor);
        READERS.put(0xdb20b188, TlReaders::readPageBlockDivider);
        READERS.put(0x48870999, TlReaders::readPageBlockFooter);
        READERS.put(0xc070d93e, TlReaders::readPageBlockPreformatted);
        READERS.put(0x467a0766, TlReaders::readPageBlockParagraph);
        READERS.put(0xf12bb6e1, TlReaders::readPageBlockSubheader);
        READERS.put(0xbfd064ec, TlReaders::readPageBlockHeader);
        READERS.put(0xbaafe5e0, TlReaders::readPageBlockAuthorDate);
        READERS.put(0x8ffa9a1f, TlReaders::readPageBlockSubtitle);
        READERS.put(0x70abc3fd, TlReaders::readPageBlockTitle);
        READERS.put(0x13567e8a, TlReaders::readPageBlockUnsupported);
        READERS.put(0x2f58683c, TlReaders::readPageListItemText);
        READERS.put(0x15031189, TlReaders::readPageListOrderedItemText);
        READERS.put(0xe8e37e5, TlReaders::readSuggestedPost);
        READERS.put(0x74aee3e0, TlReaders::readStarsTonAmount);
        READERS.put(0xbbb6b4a3, TlReaders::readStarsAmount);
        READERS.put(0xf3a9244a, TlReaders::readInputMediaStakeDice);
        READERS.put(0x9fc55fde, TlReaders::readInputMediaTodo);
        READERS.put(0x49b92a26, TlReaders::readTodoList);
        READERS.put(0xcba9a52f, TlReaders::readTodoItem);
        READERS.put(0x751f3146, TlReaders::readTextWithEntities);
        READERS.put(0x652c1c5, TlReaders::readMessageEntityDiffDelete);
        READERS.put(0xc6c1e5a7, TlReaders::readMessageEntityDiffReplace);
        READERS.put(0x71777116, TlReaders::readMessageEntityDiffInsert);
        READERS.put(0x904ac7c7, TlReaders::readMessageEntityFormattedDate);
        READERS.put(0xf1ccaaac, TlReaders::readMessageEntityBlockquote);
        READERS.put(0xc8cf05f8, TlReaders::readMessageEntityCustomEmoji);
        READERS.put(0x32ca960f, TlReaders::readMessageEntitySpoiler);
        READERS.put(0x761e6af4, TlReaders::readMessageEntityBankCard);
        READERS.put(0xbf0693d4, TlReaders::readMessageEntityStrike);
        READERS.put(0x9c4e7e8b, TlReaders::readMessageEntityUnderline);
        READERS.put(0x4c4e743f, TlReaders::readMessageEntityCashtag);
        READERS.put(0x9b69e34b, TlReaders::readMessageEntityPhone);
        READERS.put(0x208e68c9, TlReaders::readInputMessageEntityMentionName);
        READERS.put(0x1da448e2, TlReaders::readInputUserFromMessage);
        READERS.put(0xf21158c6, TlReaders::readInputUser);
        READERS.put(0xf7c1b13f, TlReaders::readInputUserSelf);
        READERS.put(0xb98886cf, TlReaders::readInputUserEmpty);
        READERS.put(0xdc7b1140, TlReaders::readMessageEntityMentionName);
        READERS.put(0x76a6d327, TlReaders::readMessageEntityTextUrl);
        READERS.put(0x73924be0, TlReaders::readMessageEntityPre);
        READERS.put(0x28a20571, TlReaders::readMessageEntityCode);
        READERS.put(0x826f8b60, TlReaders::readMessageEntityItalic);
        READERS.put(0xbd610bc9, TlReaders::readMessageEntityBold);
        READERS.put(0x64e475c2, TlReaders::readMessageEntityEmail);
        READERS.put(0x6ed02538, TlReaders::readMessageEntityUrl);
        READERS.put(0x6cef8ac7, TlReaders::readMessageEntityBotCommand);
        READERS.put(0x6f635b0d, TlReaders::readMessageEntityHashtag);
        READERS.put(0xfa04579d, TlReaders::readMessageEntityMention);
        READERS.put(0xbb92ba95, TlReaders::readMessageEntityUnknown);
        READERS.put(0xc4103386, TlReaders::readInputMediaPaidMedia);
        READERS.put(0xc21b8849, TlReaders::readInputMediaWebPage);
        READERS.put(0x89fdd778, TlReaders::readInputMediaStory);
        READERS.put(0xe66fbf7b, TlReaders::readInputMediaDice);
        READERS.put(0x883a4108, TlReaders::readInputMediaPoll);
        READERS.put(0x971fa843, TlReaders::readInputMediaGeoLive);
        READERS.put(0x405fef0d, TlReaders::readInputMediaInvoice);
        READERS.put(0xd33f43f3, TlReaders::readInputMediaGame);
        READERS.put(0xc331e80a, TlReaders::readInputGameShortName);
        READERS.put(0x32c3e77, TlReaders::readInputGameID);
        READERS.put(0x779600f9, TlReaders::readInputMediaDocumentExternal);
        READERS.put(0x3bb3b94a, TlReaders::readInputPhoto);
        READERS.put(0x1cd7bf0d, TlReaders::readInputPhotoEmpty);
        READERS.put(0xe5bbfe1a, TlReaders::readInputMediaPhotoExternal);
        READERS.put(0xc13d1c11, TlReaders::readInputMediaVenue);
        READERS.put(0xa8763ab5, TlReaders::readInputMediaDocument);
        READERS.put(0x1abfb575, TlReaders::readInputDocument);
        READERS.put(0x72f0eaae, TlReaders::readInputDocumentEmpty);
        READERS.put(0x37c9330, TlReaders::readInputMediaUploadedDocument);
        READERS.put(0x62dc8b48, TlReaders::readInputFileStoryDocument);
        READERS.put(0xfa4f0bb5, TlReaders::readInputFileBig);
        READERS.put(0xf52ff27f, TlReaders::readInputFile);
        READERS.put(0xf8ab7dfb, TlReaders::readInputMediaContact);
        READERS.put(0xf9c44144, TlReaders::readInputMediaGeoPoint);
        READERS.put(0xe3af4434, TlReaders::readInputMediaPhoto);
        READERS.put(0x7d8375da, TlReaders::readInputMediaUploadedPhoto);
        READERS.put(0x9664f57f, TlReaders::readInputMediaEmpty);
        READERS.put(0x7d748d04, TlReaders::readDataJSON);
        READERS.put(0x49ee584, TlReaders::readInvoice);
        READERS.put(0xcb296bf8, TlReaders::readLabeledPrice);
        READERS.put(0x9bed434d, TlReaders::readInputWebDocument);
        READERS.put(0x966e2dbf, TlReaders::readPoll);
        READERS.put(0x199fed96, TlReaders::readInputPollAnswer);
        READERS.put(0x4b7d786a, TlReaders::readPollAnswer);
        READERS.put(0xca5cab89, TlReaders::readMessageMediaVideoStream);
        READERS.put(0x8c10603f, TlReaders::readInputGroupCallInviteMessage);
        READERS.put(0xfe06823f, TlReaders::readInputGroupCallSlug);
        READERS.put(0xd8aa840f, TlReaders::readInputGroupCall);
        READERS.put(0x8a53b014, TlReaders::readMessageMediaToDo);
        READERS.put(0x221bb5e4, TlReaders::readTodoCompletion);
        READERS.put(0xa8852491, TlReaders::readMessageMediaPaidMedia);
        READERS.put(0xee479c64, TlReaders::readMessageExtendedMedia);
        READERS.put(0xceaa3ea1, TlReaders::readMessageMediaGiveawayResults);
        READERS.put(0xaa073beb, TlReaders::readMessageMediaGiveaway);
        READERS.put(0x68cb6283, TlReaders::readMessageMediaStory);
        READERS.put(0x16a4b93c, TlReaders::readStoryItem);
        READERS.put(0x523da4eb, TlReaders::readReactionPaid);
        READERS.put(0x8935fc73, TlReaders::readReactionCustomEmoji);
        READERS.put(0x1b2286b8, TlReaders::readReactionEmoji);
        READERS.put(0x79f5d419, TlReaders::readReactionEmpty);
        READERS.put(0x8d595cd6, TlReaders::readStoryViews);
        READERS.put(0xa3d1cb80, TlReaders::readReactionCount);
        READERS.put(0xf6a5f82f, TlReaders::readPrivacyValueDisallowBots);
        READERS.put(0x21461b5d, TlReaders::readPrivacyValueAllowBots);
        READERS.put(0xece9814b, TlReaders::readPrivacyValueAllowPremium);
        READERS.put(0xf7e8d89b, TlReaders::readPrivacyValueAllowCloseFriends);
        READERS.put(0x41c87565, TlReaders::readPrivacyValueDisallowChatParticipants);
        READERS.put(0x6b134e8e, TlReaders::readPrivacyValueAllowChatParticipants);
        READERS.put(0xe4621141, TlReaders::readPrivacyValueDisallowUsers);
        READERS.put(0x8b73e763, TlReaders::readPrivacyValueDisallowAll);
        READERS.put(0xf888fa1a, TlReaders::readPrivacyValueDisallowContacts);
        READERS.put(0xb8905fb2, TlReaders::readPrivacyValueAllowUsers);
        READERS.put(0x65427b82, TlReaders::readPrivacyValueAllowAll);
        READERS.put(0xfffe1bac, TlReaders::readPrivacyValueAllowContacts);
        READERS.put(0x5787686d, TlReaders::readMediaAreaStarGift);
        READERS.put(0xcfc9e002, TlReaders::readMediaAreaCoordinates);
        READERS.put(0x49a6549c, TlReaders::readMediaAreaWeather);
        READERS.put(0x37381085, TlReaders::readMediaAreaUrl);
        READERS.put(0x2271f2bf, TlReaders::readInputMediaAreaChannelPost);
        READERS.put(0x770416af, TlReaders::readMediaAreaChannelPost);
        READERS.put(0x14455871, TlReaders::readMediaAreaSuggestedReaction);
        READERS.put(0xcad5452d, TlReaders::readMediaAreaGeoPoint);
        READERS.put(0xde4c5d93, TlReaders::readGeoPointAddress);
        READERS.put(0xb282217f, TlReaders::readInputMediaAreaVenue);
        READERS.put(0xbe82db9c, TlReaders::readMediaAreaVenue);
        READERS.put(0x8cbec07, TlReaders::readMessageMediaDice);
        READERS.put(0xda2ad647, TlReaders::readMessages_emojiGameOutcome);
        READERS.put(0x773f4e66, TlReaders::readMessageMediaPoll);
        READERS.put(0xb940c666, TlReaders::readMessageMediaGeoLive);
        READERS.put(0xf6a548d3, TlReaders::readMessageMediaInvoice);
        READERS.put(0xad628cc8, TlReaders::readMessageExtendedMediaPreview);
        READERS.put(0xf9c8bcc6, TlReaders::readWebDocumentNoProxy);
        READERS.put(0x1c570ed1, TlReaders::readWebDocument);
        READERS.put(0xfdb19008, TlReaders::readMessageMediaGame);
        READERS.put(0xbdf9653b, TlReaders::readGame);
        READERS.put(0x2ec0533f, TlReaders::readMessageMediaVenue);
        READERS.put(0xddf10c3b, TlReaders::readMessageMediaWebPage);
        READERS.put(0x7311ca11, TlReaders::readWebPageNotModified);
        READERS.put(0xe89c45b2, TlReaders::readWebPage);
        READERS.put(0x7781fe18, TlReaders::readWebPageAttributeAiComposeTone);
        READERS.put(0x1c641c2, TlReaders::readWebPageAttributeStarGiftAuction);
        READERS.put(0x85f0a9cd, TlReaders::readStarGiftUnique);
        READERS.put(0xe0bff26c, TlReaders::readStarGiftAttributeOriginalDetails);
        READERS.put(0x9f2504e4, TlReaders::readStarGiftAttributeBackdrop);
        READERS.put(0xcef7e7a8, TlReaders::readStarGiftAttributeRarityLegendary);
        READERS.put(0x78fbf3a8, TlReaders::readStarGiftAttributeRarityEpic);
        READERS.put(0xf08d516b, TlReaders::readStarGiftAttributeRarityRare);
        READERS.put(0xdbce6389, TlReaders::readStarGiftAttributeRarityUncommon);
        READERS.put(0x36437737, TlReaders::readStarGiftAttributeRarity);
        READERS.put(0x4e7085ea, TlReaders::readStarGiftAttributePattern);
        READERS.put(0x565251e2, TlReaders::readStarGiftAttributeModel);
        READERS.put(0x313a9547, TlReaders::readStarGift);
        READERS.put(0xaff56398, TlReaders::readStarGiftBackground);
        READERS.put(0x31cad303, TlReaders::readWebPageAttributeStarGiftCollection);
        READERS.put(0xcf6f6db8, TlReaders::readWebPageAttributeUniqueStarGift);
        READERS.put(0x50cc03d3, TlReaders::readWebPageAttributeStickerSet);
        READERS.put(0x2e94c3e7, TlReaders::readWebPageAttributeStory);
        READERS.put(0xffadc913, TlReaders::readStoryItemSkipped);
        READERS.put(0x51e6ee4f, TlReaders::readStoryItemDeleted);
        READERS.put(0x54b56617, TlReaders::readWebPageAttributeTheme);
        READERS.put(0xfa58b6d4, TlReaders::readThemeSettings);
        READERS.put(0x5b11125a, TlReaders::readBaseThemeArctic);
        READERS.put(0x6d5f77ee, TlReaders::readBaseThemeTinted);
        READERS.put(0xb7b31ea8, TlReaders::readBaseThemeNight);
        READERS.put(0xfbd81688, TlReaders::readBaseThemeDay);
        READERS.put(0xc3a12462, TlReaders::readBaseThemeClassic);
        READERS.put(0x98657f0d, TlReaders::readPage);
        READERS.put(0xb0d13e47, TlReaders::readWebPagePending);
        READERS.put(0x211a1788, TlReaders::readWebPageEmpty);
        READERS.put(0x52d8ccd9, TlReaders::readMessageMediaDocument);
        READERS.put(0x9f84f49e, TlReaders::readMessageMediaUnsupported);
        READERS.put(0x70322949, TlReaders::readMessageMediaContact);
        READERS.put(0x56e0d474, TlReaders::readMessageMediaGeo);
        READERS.put(0xe216eb63, TlReaders::readMessageMediaPhoto);
        READERS.put(0x3ded6320, TlReaders::readMessageMediaEmpty);
        READERS.put(0xba7bb15e, TlReaders::readPollResults);
        READERS.put(0x3645230a, TlReaders::readPollAnswerVoters);
        READERS.put(0xb826e150, TlReaders::readStoryFwdHeader);
        READERS.put(0x4119b95e, TlReaders::readInputReplyToEphemeralMessage);
        READERS.put(0x69d66c45, TlReaders::readInputReplyToMonoForum);
        READERS.put(0x5881323a, TlReaders::readInputReplyToStory);
        READERS.put(0x3bd4b7c2, TlReaders::readInputReplyToMessage);
        READERS.put(0x1b0c841a, TlReaders::readDraftMessageEmpty);
        READERS.put(0x99622c0c, TlReaders::readPeerNotifySettings);
        READERS.put(0xff6c8049, TlReaders::readNotificationSoundRingtone);
        READERS.put(0x830b9ae4, TlReaders::readNotificationSoundLocal);
        READERS.put(0x6f0c34df, TlReaders::readNotificationSoundNone);
        READERS.put(0x97e8bebe, TlReaders::readNotificationSoundDefault);
        READERS.put(0x23f109b, TlReaders::readForumTopicDeleted);
        READERS.put(0xae168909, TlReaders::readChannelAdminLogEventActionDeleteTopic);
        READERS.put(0xf06fe208, TlReaders::readChannelAdminLogEventActionEditTopic);
        READERS.put(0x58707d28, TlReaders::readChannelAdminLogEventActionCreateTopic);
        READERS.put(0x2cc6383, TlReaders::readChannelAdminLogEventActionToggleForum);
        READERS.put(0xf04fb3a9, TlReaders::readChannelAdminLogEventActionChangeUsernames);
        READERS.put(0xbe4e0ef8, TlReaders::readChannelAdminLogEventActionChangeAvailableReactions);
        READERS.put(0x661d4037, TlReaders::readChatReactionsSome);
        READERS.put(0x52928bca, TlReaders::readChatReactionsAll);
        READERS.put(0xeafc32bc, TlReaders::readChatReactionsNone);
        READERS.put(0x278f2868, TlReaders::readChannelAdminLogEventActionSendMessage);
        READERS.put(0x7a800e0a, TlReaders::readMessageService);
        READERS.put(0xa339f0b, TlReaders::readMessageReactions);
        READERS.put(0x4ba3a95a, TlReaders::readMessageReactor);
        READERS.put(0x8c79b63c, TlReaders::readMessagePeerReaction);
        READERS.put(0x5d20bae8, TlReaders::readMessageActionChangeCommunity);
        READERS.put(0x16605e3e, TlReaders::readMessageActionManagedBotCreated);
        READERS.put(0x399674dc, TlReaders::readMessageActionPollDeleteAnswer);
        READERS.put(0x9da1cd6c, TlReaders::readMessageActionPollAppendAnswer);
        READERS.put(0x3e2793ba, TlReaders::readMessageActionNoForwardsRequest);
        READERS.put(0xbf7d6572, TlReaders::readMessageActionNoForwardsToggle);
        READERS.put(0xe188503b, TlReaders::readMessageActionChangeCreator);
        READERS.put(0xb07ed085, TlReaders::readMessageActionNewCreatorPending);
        READERS.put(0x73ada76b, TlReaders::readMessageActionStarGiftPurchaseOfferDeclined);
        READERS.put(0x774278d4, TlReaders::readMessageActionStarGiftPurchaseOffer);
        READERS.put(0x2c8f2a25, TlReaders::readMessageActionSuggestBirthday);
        READERS.put(0x6c8e1e06, TlReaders::readBirthday);
        READERS.put(0xa8a3c699, TlReaders::readMessageActionGiftTon);
        READERS.put(0x69f916f8, TlReaders::readMessageActionSuggestedPostRefund);
        READERS.put(0x95ddcf69, TlReaders::readMessageActionSuggestedPostSuccess);
        READERS.put(0xee7a1596, TlReaders::readMessageActionSuggestedPostApproval);
        READERS.put(0xc7edbc83, TlReaders::readMessageActionTodoAppendTasks);
        READERS.put(0xcc7c5c89, TlReaders::readMessageActionTodoCompletions);
        READERS.put(0x2ffe2f7a, TlReaders::readMessageActionConferenceCall);
        READERS.put(0x84b88578, TlReaders::readMessageActionPaidMessagesPrice);
        READERS.put(0xac1f1fcd, TlReaders::readMessageActionPaidMessagesRefunded);
        READERS.put(0xe6c31522, TlReaders::readMessageActionStarGiftUnique);
        READERS.put(0xea2c31d3, TlReaders::readMessageActionStarGift);
        READERS.put(0xb00c47a2, TlReaders::readMessageActionPrizeStars);
        READERS.put(0x45d5b021, TlReaders::readMessageActionGiftStars);
        READERS.put(0x41b3e202, TlReaders::readMessageActionPaymentRefunded);
        READERS.put(0xea02c27e, TlReaders::readPaymentCharge);
        READERS.put(0x93b31848, TlReaders::readMessageActionRequestedPeerSentMe);
        READERS.put(0x8ba403e4, TlReaders::readRequestedPeerChannel);
        READERS.put(0x7307544f, TlReaders::readRequestedPeerChat);
        READERS.put(0xd62ff46a, TlReaders::readRequestedPeerUser);
        READERS.put(0xcc02aa6d, TlReaders::readMessageActionBoostApply);
        READERS.put(0x87e2f155, TlReaders::readMessageActionGiveawayResults);
        READERS.put(0xa80f51e4, TlReaders::readMessageActionGiveawayLaunch);
        READERS.put(0x31c48347, TlReaders::readMessageActionGiftCode);
        READERS.put(0x5060a3f4, TlReaders::readMessageActionSetChatWallPaper);
        READERS.put(0x31518e9b, TlReaders::readMessageActionRequestedPeer);
        READERS.put(0x57de635e, TlReaders::readMessageActionSuggestProfilePhoto);
        READERS.put(0xc0944820, TlReaders::readMessageActionTopicEdit);
        READERS.put(0xd999256, TlReaders::readMessageActionTopicCreate);
        READERS.put(0x48e91302, TlReaders::readMessageActionGiftPremium);
        READERS.put(0xb4c38cb5, TlReaders::readMessageActionWebViewDataSent);
        READERS.put(0x47dd8079, TlReaders::readMessageActionWebViewDataSentMe);
        READERS.put(0xebbca3cb, TlReaders::readMessageActionChatJoinedByRequest);
        READERS.put(0xb91bbd3a, TlReaders::readMessageActionSetChatTheme);
        READERS.put(0x3458f9c8, TlReaders::readChatThemeUniqueGift);
        READERS.put(0xc3dffc04, TlReaders::readChatTheme);
        READERS.put(0xb3a07661, TlReaders::readMessageActionGroupCallScheduled);
        READERS.put(0x3c134d7b, TlReaders::readMessageActionSetMessagesTTL);
        READERS.put(0x502f92f7, TlReaders::readMessageActionInviteToGroupCall);
        READERS.put(0x7a0d7f42, TlReaders::readMessageActionGroupCall);
        READERS.put(0x98e0d697, TlReaders::readMessageActionGeoProximityReached);
        READERS.put(0xf3f25f76, TlReaders::readMessageActionContactSignUp);
        READERS.put(0xd95c6154, TlReaders::readMessageActionSecureValuesSent);
        READERS.put(0x8e3ca7ee, TlReaders::readSecureValueTypeEmail);
        READERS.put(0xb320aadb, TlReaders::readSecureValueTypePhone);
        READERS.put(0xea02ec33, TlReaders::readSecureValueTypeTemporaryRegistration);
        READERS.put(0x99e3806a, TlReaders::readSecureValueTypePassportRegistration);
        READERS.put(0x8b883488, TlReaders::readSecureValueTypeRentalAgreement);
        READERS.put(0x89137c0d, TlReaders::readSecureValueTypeBankStatement);
        READERS.put(0xfc36954e, TlReaders::readSecureValueTypeUtilityBill);
        READERS.put(0xcbe31e26, TlReaders::readSecureValueTypeAddress);
        READERS.put(0x99a48f23, TlReaders::readSecureValueTypeInternalPassport);
        READERS.put(0xa0d0744b, TlReaders::readSecureValueTypeIdentityCard);
        READERS.put(0x6e425c4, TlReaders::readSecureValueTypeDriverLicense);
        READERS.put(0x3dac6a00, TlReaders::readSecureValueTypePassport);
        READERS.put(0x9d2a81e3, TlReaders::readSecureValueTypePersonalDetails);
        READERS.put(0x1b287353, TlReaders::readMessageActionSecureValuesSentMe);
        READERS.put(0x33f0ea47, TlReaders::readSecureCredentialsEncrypted);
        READERS.put(0x187fa0ca, TlReaders::readSecureValue);
        READERS.put(0x21ec5a5f, TlReaders::readSecurePlainEmail);
        READERS.put(0x7d6099dd, TlReaders::readSecurePlainPhone);
        READERS.put(0x7d09c27e, TlReaders::readSecureFile);
        READERS.put(0x64199744, TlReaders::readSecureFileEmpty);
        READERS.put(0x8aeabec3, TlReaders::readSecureData);
        READERS.put(0xc516d679, TlReaders::readMessageActionBotAllowed);
        READERS.put(0x95fcd1d6, TlReaders::readBotApp);
        READERS.put(0x5da674b7, TlReaders::readBotAppNotModified);
        READERS.put(0xfae69f56, TlReaders::readMessageActionCustomAction);
        READERS.put(0x4792929b, TlReaders::readMessageActionScreenshotTaken);
        READERS.put(0x80e11a7f, TlReaders::readMessageActionPhoneCall);
        READERS.put(0x9fbbf1f7, TlReaders::readPhoneCallDiscardReasonMigrateConferenceCall);
        READERS.put(0xfaf7e8c9, TlReaders::readPhoneCallDiscardReasonBusy);
        READERS.put(0x57adc690, TlReaders::readPhoneCallDiscardReasonHangup);
        READERS.put(0xe095c1a0, TlReaders::readPhoneCallDiscardReasonDisconnect);
        READERS.put(0x85e42301, TlReaders::readPhoneCallDiscardReasonMissed);
        READERS.put(0xc624b16e, TlReaders::readMessageActionPaymentSent);
        READERS.put(0xffa00ccc, TlReaders::readMessageActionPaymentSentMe);
        READERS.put(0x909c3f94, TlReaders::readPaymentRequestedInfo);
        READERS.put(0x1e8caaeb, TlReaders::readPostAddress);
        READERS.put(0x92a72876, TlReaders::readMessageActionGameScore);
        READERS.put(0x9fbab604, TlReaders::readMessageActionHistoryClear);
        READERS.put(0x94bd38ed, TlReaders::readMessageActionPinMessage);
        READERS.put(0xea3948e9, TlReaders::readMessageActionChannelMigrateFrom);
        READERS.put(0xe1037f92, TlReaders::readMessageActionChatMigrateTo);
        READERS.put(0x95d2ac92, TlReaders::readMessageActionChannelCreate);
        READERS.put(0x31224c3, TlReaders::readMessageActionChatJoinedByLink);
        READERS.put(0xa43f30cc, TlReaders::readMessageActionChatDeleteUser);
        READERS.put(0x15cefd00, TlReaders::readMessageActionChatAddUser);
        READERS.put(0x95e3fbef, TlReaders::readMessageActionChatDeletePhoto);
        READERS.put(0x7fcb13a8, TlReaders::readMessageActionChatEditPhoto);
        READERS.put(0xb5a1ce5a, TlReaders::readMessageActionChatEditTitle);
        READERS.put(0xbd47cbad, TlReaders::readMessageActionChatCreate);
        READERS.put(0xb6aef7b0, TlReaders::readMessageActionEmpty);
        READERS.put(0xe5af939, TlReaders::readMessageReplyStoryHeader);
        READERS.put(0x1b97dd66, TlReaders::readMessageReplyHeader);
        READERS.put(0x4e4df4bb, TlReaders::readMessageFwdHeader);
        READERS.put(0x7600b9d3, TlReaders::readMessage);
        READERS.put(0xb89bfccf, TlReaders::readFactCheck);
        READERS.put(0x83d60fc2, TlReaders::readMessageReplies);
        READERS.put(0x48a30254, TlReaders::readReplyInlineMarkup);
        READERS.put(0x77608b83, TlReaders::readKeyboardButtonRow);
        READERS.put(0xbcc4af10, TlReaders::readKeyboardButtonCopy);
        READERS.put(0x4fdd3430, TlReaders::readKeyboardButtonStyle);
        READERS.put(0x2b78156, TlReaders::readInputKeyboardButtonRequestPeer);
        READERS.put(0x3e81e078, TlReaders::readRequestPeerTypeCreateBot);
        READERS.put(0x339bef6c, TlReaders::readRequestPeerTypeBroadcast);
        READERS.put(0xc9f06e1b, TlReaders::readRequestPeerTypeChat);
        READERS.put(0x5f3b8a00, TlReaders::readRequestPeerTypeUser);
        READERS.put(0x5b0f15f5, TlReaders::readKeyboardButtonRequestPeer);
        READERS.put(0xe15c4370, TlReaders::readKeyboardButtonSimpleWebView);
        READERS.put(0xe846b1a0, TlReaders::readKeyboardButtonWebView);
        READERS.put(0xc0fd5d09, TlReaders::readKeyboardButtonUserProfile);
        READERS.put(0x7d5e07c7, TlReaders::readInputKeyboardButtonUserProfile);
        READERS.put(0x7a11d782, TlReaders::readKeyboardButtonRequestPoll);
        READERS.put(0x68013e72, TlReaders::readInputKeyboardButtonUrlAuth);
        READERS.put(0xf51006f9, TlReaders::readKeyboardButtonUrlAuth);
        READERS.put(0x3fa53905, TlReaders::readKeyboardButtonBuy);
        READERS.put(0x89c590f9, TlReaders::readKeyboardButtonGame);
        READERS.put(0x991399fc, TlReaders::readKeyboardButtonSwitchInline);
        READERS.put(0xe3b2d0c, TlReaders::readInlineQueryPeerTypeBotPM);
        READERS.put(0x6334ee9a, TlReaders::readInlineQueryPeerTypeBroadcast);
        READERS.put(0x5ec4be43, TlReaders::readInlineQueryPeerTypeMegagroup);
        READERS.put(0xd766c50a, TlReaders::readInlineQueryPeerTypeChat);
        READERS.put(0x833c0fac, TlReaders::readInlineQueryPeerTypePM);
        READERS.put(0x3081ed9d, TlReaders::readInlineQueryPeerTypeSameBotPM);
        READERS.put(0xaa40f94d, TlReaders::readKeyboardButtonRequestGeoLocation);
        READERS.put(0x417efd8f, TlReaders::readKeyboardButtonRequestPhone);
        READERS.put(0xe62bc960, TlReaders::readKeyboardButtonCallback);
        READERS.put(0xd80c25ec, TlReaders::readKeyboardButtonUrl);
        READERS.put(0x7d170cff, TlReaders::readKeyboardButton);
        READERS.put(0x85dd99d1, TlReaders::readReplyKeyboardMarkup);
        READERS.put(0x86b40b08, TlReaders::readReplyKeyboardForceReply);
        READERS.put(0xa03e5b85, TlReaders::readReplyKeyboardHide);
        READERS.put(0x90a6ca84, TlReaders::readMessageEmpty);
        READERS.put(0xcb2ac766, TlReaders::readChannelAdminLogEventActionToggleNoForwards);
        READERS.put(0xafb6144a, TlReaders::readChannelAdminLogEventActionParticipantJoinByRequest);
        READERS.put(0xed107ab7, TlReaders::readChatInvitePublicJoinRequests);
        READERS.put(0xa22cbd96, TlReaders::readChatInviteExported);
        READERS.put(0x5416d58, TlReaders::readStarsSubscriptionPricing);
        READERS.put(0x6e941a38, TlReaders::readChannelAdminLogEventActionChangeHistoryTTL);
        READERS.put(0x3e7f6847, TlReaders::readChannelAdminLogEventActionParticipantVolume);
        READERS.put(0x2a3dc7ac, TlReaders::readGroupCallParticipant);
        READERS.put(0x67753ac8, TlReaders::readGroupCallParticipantVideo);
        READERS.put(0xdcb118b7, TlReaders::readGroupCallParticipantVideoSourceGroup);
        READERS.put(0xe90ebb59, TlReaders::readChannelAdminLogEventActionExportedInviteEdit);
        READERS.put(0x410a134e, TlReaders::readChannelAdminLogEventActionExportedInviteRevoke);
        READERS.put(0x5a50fca4, TlReaders::readChannelAdminLogEventActionExportedInviteDelete);
        READERS.put(0xfe9fc158, TlReaders::readChannelAdminLogEventActionParticipantJoinByInvite);
        READERS.put(0x56d6a247, TlReaders::readChannelAdminLogEventActionToggleGroupCallSetting);
        READERS.put(0xe64429c0, TlReaders::readChannelAdminLogEventActionParticipantUnmute);
        READERS.put(0xf92424d2, TlReaders::readChannelAdminLogEventActionParticipantMute);
        READERS.put(0xdb9f9140, TlReaders::readChannelAdminLogEventActionDiscardGroupCall);
        READERS.put(0x23209745, TlReaders::readChannelAdminLogEventActionStartGroupCall);
        READERS.put(0x53909779, TlReaders::readChannelAdminLogEventActionToggleSlowMode);
        READERS.put(0xe6b76ae, TlReaders::readChannelAdminLogEventActionChangeLocation);
        READERS.put(0x209b82db, TlReaders::readChannelLocation);
        READERS.put(0xbfb5ad8b, TlReaders::readChannelLocationEmpty);
        READERS.put(0x50c7ac8, TlReaders::readChannelAdminLogEventActionChangeLinkedChat);
        READERS.put(0x8f079643, TlReaders::readChannelAdminLogEventActionStopPoll);
        READERS.put(0x2df5fc0a, TlReaders::readChannelAdminLogEventActionDefaultBannedRights);
        READERS.put(0x5f5c95f1, TlReaders::readChannelAdminLogEventActionTogglePreHistoryHidden);
        READERS.put(0xb1c3caa7, TlReaders::readChannelAdminLogEventActionChangeStickerSet);
        READERS.put(0xd5676710, TlReaders::readChannelAdminLogEventActionParticipantToggleAdmin);
        READERS.put(0xe6d83d7e, TlReaders::readChannelAdminLogEventActionParticipantToggleBan);
        READERS.put(0xe31c34d8, TlReaders::readChannelAdminLogEventActionParticipantInvite);
        READERS.put(0xf89777f2, TlReaders::readChannelAdminLogEventActionParticipantLeave);
        READERS.put(0x183040d3, TlReaders::readChannelAdminLogEventActionParticipantJoin);
        READERS.put(0x42e047bb, TlReaders::readChannelAdminLogEventActionDeleteMessage);
        READERS.put(0x709b2405, TlReaders::readChannelAdminLogEventActionEditMessage);
        READERS.put(0xe9e82c18, TlReaders::readChannelAdminLogEventActionUpdatePinned);
        READERS.put(0x26ae0971, TlReaders::readChannelAdminLogEventActionToggleSignatures);
        READERS.put(0x1b7907ae, TlReaders::readChannelAdminLogEventActionToggleInvites);
        READERS.put(0x434bd2af, TlReaders::readChannelAdminLogEventActionChangePhoto);
        READERS.put(0x6a4afc38, TlReaders::readChannelAdminLogEventActionChangeUsername);
        READERS.put(0x55188a2e, TlReaders::readChannelAdminLogEventActionChangeAbout);
        READERS.put(0xe6dfb825, TlReaders::readChannelAdminLogEventActionChangeTitle);
        READERS.put(0x6cbe645, TlReaders::readUserFull);
        READERS.put(0xa2c0f695, TlReaders::readProfileTabGifs);
        READERS.put(0xd3656499, TlReaders::readProfileTabLinks);
        READERS.put(0xe477092e, TlReaders::readProfileTabVoice);
        READERS.put(0x9f27d26e, TlReaders::readProfileTabMusic);
        READERS.put(0xab339c00, TlReaders::readProfileTabFiles);
        READERS.put(0x72c64955, TlReaders::readProfileTabMedia);
        READERS.put(0x4d4bd46a, TlReaders::readProfileTabGifts);
        READERS.put(0xb98cd696, TlReaders::readProfileTabPosts);
        READERS.put(0x1b0e4f07, TlReaders::readStarsRating);
        READERS.put(0x71f276c4, TlReaders::readDisallowedGiftsSettings);
        READERS.put(0xf93cd45c, TlReaders::readBotVerification);
        READERS.put(0xdd0c66f2, TlReaders::readStarRefProgram);
        READERS.put(0x5a0a066d, TlReaders::readBusinessIntro);
        READERS.put(0xef156a5c, TlReaders::readBusinessAwayMessage);
        READERS.put(0x21108ff7, TlReaders::readBusinessRecipients);
        READERS.put(0xcc4d9ecc, TlReaders::readBusinessAwayMessageScheduleCustom);
        READERS.put(0xc3f2f501, TlReaders::readBusinessAwayMessageScheduleOutsideWorkHours);
        READERS.put(0xc9b9e2b9, TlReaders::readBusinessAwayMessageScheduleAlways);
        READERS.put(0xe519abab, TlReaders::readBusinessGreetingMessage);
        READERS.put(0xac5c1af7, TlReaders::readBusinessLocation);
        READERS.put(0x8c92b098, TlReaders::readBusinessWorkHours);
        READERS.put(0x120b1ab9, TlReaders::readBusinessWeeklyOpen);
        READERS.put(0x9a35e999, TlReaders::readPeerStories);
        READERS.put(0x4d8a0299, TlReaders::readBotInfo);
        READERS.put(0xb0cd6617, TlReaders::readBotVerifierSettings);
        READERS.put(0xc99b1950, TlReaders::readBotAppSettings);
        READERS.put(0xc7b57ce6, TlReaders::readBotMenuButton);
        READERS.put(0x4258c205, TlReaders::readBotMenuButtonCommands);
        READERS.put(0x7533a588, TlReaders::readBotMenuButtonDefault);
        READERS.put(0x9852d6d2, TlReaders::readBotCommand);
        READERS.put(0xf47741f7, TlReaders::readPeerSettings);
        READERS.put(0xb1b8cc83, TlReaders::readUser);
        READERS.put(0x65899777, TlReaders::readUserStatusLastMonth);
        READERS.put(0x541a1d1a, TlReaders::readUserStatusLastWeek);
        READERS.put(0x7b197dc8, TlReaders::readUserStatusRecently);
        READERS.put(0x8c703f, TlReaders::readUserStatusOffline);
        READERS.put(0xedb93949, TlReaders::readUserStatusOnline);
        READERS.put(0x9d05049, TlReaders::readUserStatusEmpty);
        READERS.put(0x82d1f706, TlReaders::readUserProfilePhoto);
        READERS.put(0x4f11bae1, TlReaders::readUserProfilePhotoEmpty);
        READERS.put(0xd3bc4b7a, TlReaders::readUserEmpty);
        READERS.put(0x2633421b, TlReaders::readChatFull);
        READERS.put(0x3cbc93f8, TlReaders::readChatParticipants);
        READERS.put(0x360d5d2, TlReaders::readChatParticipantAdmin);
        READERS.put(0xe1f867b8, TlReaders::readChatParticipantCreator);
        READERS.put(0x38e79fde, TlReaders::readChatParticipant);
        READERS.put(0x8763d3e1, TlReaders::readChatParticipantsForbidden);
        READERS.put(0xa04e8d3a, TlReaders::readChannelFull);
        READERS.put(0x2dd14edc, TlReaders::readStickerSet);
        READERS.put(0x96eaa5eb, TlReaders::readDraftMessageLayer226);
        READERS.put(0x9a8ae1e1, TlReaders::readPageBlockOrderedListLayer226);
        READERS.put(0x98dd8936, TlReaders::readPageListOrderedItemBlocksLayer226);
        READERS.put(0x1c32b11c, TlReaders::readChannelLayer227);
        READERS.put(0x25e073fc, TlReaders::readPageListItemBlocksLayer226);
        READERS.put(0xb92fb6cd, TlReaders::readPageListItemTextLayer226);
        READERS.put(0x5e068047, TlReaders::readPageListOrderedItemTextLayer226);
        READERS.put(0x95ef6f2b, TlReaders::readMessageLayer226);
        READERS.put(0xc27ac8c7, TlReaders::readBotCommandLayer227);
        READERS.put(0x31774388, TlReaders::readUserLayer227);
    }

    private static JsonObject readChannelAdminLogEvent(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEvent");
        o.addProperty("id", r.readLong());
        o.addProperty("date", r.readInt());
        o.addProperty("user_id", r.readLong());
        o.add("action", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantEditRank(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantEditRank");
        o.addProperty("user_id", r.readLong());
        o.addProperty("prev_rank", r.readString());
        o.addProperty("new_rank", r.readString());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleAutotranslation(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleAutotranslation");
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantSubExtend(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantSubExtend");
        o.add("prev_participant", r.readObject());
        o.add("new_participant", r.readObject());
        return o;
    }

    private static JsonObject readChannelParticipantLeft(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelParticipantLeft");
        o.add("peer", r.readObject());
        return o;
    }

    private static JsonObject readPeerChannel(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "peerChannel");
        o.addProperty("channel_id", r.readLong());
        return o;
    }

    private static JsonObject readPeerChat(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "peerChat");
        o.addProperty("chat_id", r.readLong());
        return o;
    }

    private static JsonObject readPeerUser(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "peerUser");
        o.addProperty("user_id", r.readLong());
        return o;
    }

    private static JsonObject readChannelParticipantBanned(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelParticipantBanned");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.add("peer", r.readObject());
        o.addProperty("kicked_by", r.readLong());
        o.addProperty("date", r.readInt());
        o.add("banned_rights", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("rank", r.readString());
        }
        return o;
    }

    private static JsonObject readChatBannedRights(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatBannedRights");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("view_messages", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("send_messages", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("send_media", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("send_stickers", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("send_gifs", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("send_games", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("send_inline", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("embed_links", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("send_polls", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("change_info", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("invite_users", TLObject.hasFlag(flags, TLObject.FLAG_15));
        o.addProperty("pin_messages", TLObject.hasFlag(flags, TLObject.FLAG_17));
        o.addProperty("manage_topics", TLObject.hasFlag(flags, TLObject.FLAG_18));
        o.addProperty("send_photos", TLObject.hasFlag(flags, TLObject.FLAG_19));
        o.addProperty("send_videos", TLObject.hasFlag(flags, TLObject.FLAG_20));
        o.addProperty("send_roundvideos", TLObject.hasFlag(flags, TLObject.FLAG_21));
        o.addProperty("send_audios", TLObject.hasFlag(flags, TLObject.FLAG_22));
        o.addProperty("send_voices", TLObject.hasFlag(flags, TLObject.FLAG_23));
        o.addProperty("send_docs", TLObject.hasFlag(flags, TLObject.FLAG_24));
        o.addProperty("send_plain", TLObject.hasFlag(flags, TLObject.FLAG_25));
        o.addProperty("edit_rank", TLObject.hasFlag(flags, TLObject.FLAG_26));
        o.addProperty("send_reactions", TLObject.hasFlag(flags, TLObject.FLAG_27));
        o.addProperty("manage_linked_peers", TLObject.hasFlag(flags, TLObject.FLAG_28));
        o.addProperty("until_date", r.readInt());
        return o;
    }

    private static JsonObject readChannelParticipantAdmin(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelParticipantAdmin");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("can_edit", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("self", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("user_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("inviter_id", r.readLong());
        }
        o.addProperty("promoted_by", r.readLong());
        o.addProperty("date", r.readInt());
        o.add("admin_rights", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("rank", r.readString());
        }
        return o;
    }

    private static JsonObject readChatAdminRights(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatAdminRights");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("change_info", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("post_messages", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("edit_messages", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("delete_messages", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("ban_users", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("invite_users", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("pin_messages", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("add_admins", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("anonymous", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("manage_call", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("other", TLObject.hasFlag(flags, TLObject.FLAG_12));
        o.addProperty("manage_topics", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("post_stories", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("edit_stories", TLObject.hasFlag(flags, TLObject.FLAG_15));
        o.addProperty("delete_stories", TLObject.hasFlag(flags, TLObject.FLAG_16));
        o.addProperty("manage_direct_messages", TLObject.hasFlag(flags, TLObject.FLAG_17));
        o.addProperty("manage_ranks", TLObject.hasFlag(flags, TLObject.FLAG_18));
        o.addProperty("manage_linked_peers", TLObject.hasFlag(flags, TLObject.FLAG_19));
        return o;
    }

    private static JsonObject readChannelParticipantCreator(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelParticipantCreator");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("user_id", r.readLong());
        o.add("admin_rights", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("rank", r.readString());
        }
        return o;
    }

    private static JsonObject readChannelParticipantSelf(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelParticipantSelf");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("via_request", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("user_id", r.readLong());
        o.addProperty("inviter_id", r.readLong());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("subscription_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("rank", r.readString());
        }
        return o;
    }

    private static JsonObject readChannelParticipant(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelParticipant");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("user_id", r.readLong());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("subscription_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("rank", r.readString());
        }
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleSignatureProfiles(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleSignatureProfiles");
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeEmojiStickerSet(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeEmojiStickerSet");
        o.add("prev_stickerset", r.readObject());
        o.add("new_stickerset", r.readObject());
        return o;
    }

    private static JsonObject readInputStickerSetTonGifts(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetTonGifts");
        return o;
    }

    private static JsonObject readInputStickerSetEmojiChannelDefaultStatuses(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetEmojiChannelDefaultStatuses");
        return o;
    }

    private static JsonObject readInputStickerSetEmojiDefaultTopicIcons(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetEmojiDefaultTopicIcons");
        return o;
    }

    private static JsonObject readInputStickerSetEmojiDefaultStatuses(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetEmojiDefaultStatuses");
        return o;
    }

    private static JsonObject readInputStickerSetEmojiGenericAnimations(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetEmojiGenericAnimations");
        return o;
    }

    private static JsonObject readInputStickerSetPremiumGifts(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetPremiumGifts");
        return o;
    }

    private static JsonObject readInputStickerSetAnimatedEmojiAnimations(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetAnimatedEmojiAnimations");
        return o;
    }

    private static JsonObject readInputStickerSetDice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetDice");
        o.addProperty("emoticon", r.readString());
        return o;
    }

    private static JsonObject readInputStickerSetAnimatedEmoji(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetAnimatedEmoji");
        return o;
    }

    private static JsonObject readInputStickerSetShortName(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetShortName");
        o.addProperty("short_name", r.readString());
        return o;
    }

    private static JsonObject readInputStickerSetID(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetID");
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        return o;
    }

    private static JsonObject readInputStickerSetEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputStickerSetEmpty");
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeEmojiStatus(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeEmojiStatus");
        o.add("prev_value", r.readObject());
        o.add("new_value", r.readObject());
        return o;
    }

    private static JsonObject readInputEmojiStatusCollectible(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputEmojiStatusCollectible");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("collectible_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("until", r.readInt());
        }
        return o;
    }

    private static JsonObject readEmojiStatusCollectible(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "emojiStatusCollectible");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("collectible_id", r.readLong());
        o.addProperty("document_id", r.readLong());
        o.addProperty("title", r.readString());
        o.addProperty("slug", r.readString());
        o.addProperty("pattern_document_id", r.readLong());
        o.addProperty("center_color", r.readInt());
        o.addProperty("edge_color", r.readInt());
        o.addProperty("pattern_color", r.readInt());
        o.addProperty("text_color", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("until", r.readInt());
        }
        return o;
    }

    private static JsonObject readEmojiStatus(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "emojiStatus");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("document_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("until", r.readInt());
        }
        return o;
    }

    private static JsonObject readEmojiStatusEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "emojiStatusEmpty");
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeWallpaper(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeWallpaper");
        o.add("prev_value", r.readObject());
        o.add("new_value", r.readObject());
        return o;
    }

    private static JsonObject readWallPaperNoFile(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "wallPaperNoFile");
        o.addProperty("id", r.readLong());
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("default", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("dark", TLObject.hasFlag(flags, TLObject.FLAG_4));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("settings", r.readObject());
        }
        return o;
    }

    private static JsonObject readWallPaperSettings(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "wallPaperSettings");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("blur", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("motion", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("second_background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("third_background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("fourth_background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("intensity", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("rotation", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("emoticon", r.readString());
        }
        return o;
    }

    private static JsonObject readWallPaper(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "wallPaper");
        o.addProperty("id", r.readLong());
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("default", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("pattern", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("dark", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("access_hash", r.readLong());
        o.addProperty("slug", r.readString());
        o.add("document", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("settings", r.readObject());
        }
        return o;
    }

    private static JsonObject readDocument(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "document");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("file_reference", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        o.addProperty("date", r.readInt());
        o.addProperty("mime_type", r.readString());
        o.addProperty("size", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("thumbs", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("video_thumbs", r.readVector(TlBinaryReader::readObject));
        }
        o.addProperty("dc_id", r.readInt());
        o.add("attributes", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readDocumentAttributeCustomEmoji(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentAttributeCustomEmoji");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("free", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("text_color", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("alt", r.readString());
        o.add("stickerset", r.readObject());
        return o;
    }

    private static JsonObject readDocumentAttributeHasStickers(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentAttributeHasStickers");
        return o;
    }

    private static JsonObject readDocumentAttributeFilename(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentAttributeFilename");
        o.addProperty("file_name", r.readString());
        return o;
    }

    private static JsonObject readDocumentAttributeAudio(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentAttributeAudio");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("voice", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("duration", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("performer", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("waveform", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        }
        return o;
    }

    private static JsonObject readDocumentAttributeVideo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentAttributeVideo");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("round_message", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("supports_streaming", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("nosound", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("duration", r.readDouble());
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("preload_prefix_size", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("video_start_ts", r.readDouble());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("video_codec", r.readString());
        }
        return o;
    }

    private static JsonObject readDocumentAttributeSticker(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentAttributeSticker");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("mask", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("alt", r.readString());
        o.add("stickerset", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("mask_coords", r.readObject());
        }
        return o;
    }

    private static JsonObject readMaskCoords(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "maskCoords");
        o.addProperty("n", r.readInt());
        o.addProperty("x", r.readDouble());
        o.addProperty("y", r.readDouble());
        o.addProperty("zoom", r.readDouble());
        return o;
    }

    private static JsonObject readDocumentAttributeAnimated(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentAttributeAnimated");
        return o;
    }

    private static JsonObject readDocumentAttributeImageSize(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentAttributeImageSize");
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        return o;
    }

    private static JsonObject readVideoSizeStickerMarkup(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "videoSizeStickerMarkup");
        o.add("stickerset", r.readObject());
        o.addProperty("sticker_id", r.readLong());
        o.add("background_colors", r.readVector(TlBinaryReader::readInt));
        return o;
    }

    private static JsonObject readVideoSizeEmojiMarkup(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "videoSizeEmojiMarkup");
        o.addProperty("emoji_id", r.readLong());
        o.add("background_colors", r.readVector(TlBinaryReader::readInt));
        return o;
    }

    private static JsonObject readVideoSize(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "videoSize");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("type", r.readString());
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        o.addProperty("size", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("video_start_ts", r.readDouble());
        }
        return o;
    }

    private static JsonObject readPhotoPathSize(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "photoPathSize");
        o.addProperty("type", r.readString());
        o.addProperty("bytes", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readPhotoSizeProgressive(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "photoSizeProgressive");
        o.addProperty("type", r.readString());
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        o.add("sizes", r.readVector(TlBinaryReader::readInt));
        return o;
    }

    private static JsonObject readPhotoStrippedSize(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "photoStrippedSize");
        o.addProperty("type", r.readString());
        o.addProperty("bytes", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readPhotoCachedSize(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "photoCachedSize");
        o.addProperty("type", r.readString());
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        o.addProperty("bytes", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readPhotoSize(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "photoSize");
        o.addProperty("type", r.readString());
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        o.addProperty("size", r.readInt());
        return o;
    }

    private static JsonObject readPhotoSizeEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "photoSizeEmpty");
        o.addProperty("type", r.readString());
        return o;
    }

    private static JsonObject readDocumentEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "documentEmpty");
        o.addProperty("id", r.readLong());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeProfilePeerColor(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeProfilePeerColor");
        o.add("prev_value", r.readObject());
        o.add("new_value", r.readObject());
        return o;
    }

    private static JsonObject readInputPeerColorCollectible(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPeerColorCollectible");
        o.addProperty("collectible_id", r.readLong());
        return o;
    }

    private static JsonObject readPeerColorCollectible(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "peerColorCollectible");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("collectible_id", r.readLong());
        o.addProperty("gift_emoji_id", r.readLong());
        o.addProperty("background_emoji_id", r.readLong());
        o.addProperty("accent_color", r.readInt());
        o.add("colors", r.readVector(TlBinaryReader::readInt));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("dark_accent_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("dark_colors", r.readVector(TlBinaryReader::readInt));
        }
        return o;
    }

    private static JsonObject readPeerColor(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "peerColor");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("background_emoji_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangePeerColor(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangePeerColor");
        o.add("prev_value", r.readObject());
        o.add("new_value", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleAntiSpam(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleAntiSpam");
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionPinTopic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionPinTopic");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("prev_topic", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("new_topic", r.readObject());
        }
        return o;
    }

    private static JsonObject readForumTopic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "forumTopic");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("my", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("closed", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("short", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("hidden", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("title_missing", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("id", r.readInt());
        o.addProperty("date", r.readInt());
        o.add("peer", r.readObject());
        o.addProperty("title", r.readString());
        o.addProperty("icon_color", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("icon_emoji_id", r.readLong());
        }
        o.addProperty("top_message", r.readInt());
        o.addProperty("read_inbox_max_id", r.readInt());
        o.addProperty("read_outbox_max_id", r.readInt());
        o.addProperty("unread_count", r.readInt());
        o.addProperty("unread_mentions_count", r.readInt());
        o.addProperty("unread_reactions_count", r.readInt());
        o.addProperty("unread_poll_votes_count", r.readInt());
        o.add("from_id", r.readObject());
        o.add("notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("draft", r.readObject());
        }
        return o;
    }

    private static JsonObject readDraftMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "draftMessage");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("no_webpage", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("invert_media", TLObject.hasFlag(flags, TLObject.FLAG_6));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("reply_to", r.readObject());
        }
        o.addProperty("message", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("media", r.readObject());
        }
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("effect", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("suggested_post", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("rich_message", r.readObject());
        }
        return o;
    }

    private static JsonObject readRichMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "richMessage");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("rtl", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("part", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        o.add("photos", r.readVector(TlBinaryReader::readObject));
        o.add("documents", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "photo");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("has_stickers", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("file_reference", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        o.addProperty("date", r.readInt());
        o.add("sizes", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("video_sizes", r.readVector(TlBinaryReader::readObject));
        }
        o.addProperty("dc_id", r.readInt());
        return o;
    }

    private static JsonObject readPhotoEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "photoEmpty");
        o.addProperty("id", r.readLong());
        return o;
    }

    private static JsonObject readPageBlockBlockquoteBlocks(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockBlockquoteBlocks");
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readTextDiff(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textDiff");
        o.add("text", r.readObject());
        o.add("old_text", r.readObject());
        return o;
    }

    private static JsonObject readTextDate(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textDate");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("relative", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("short_time", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("long_time", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("short_date", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("long_date", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("day_of_week", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.add("text", r.readObject());
        o.addProperty("date", r.readInt());
        return o;
    }

    private static JsonObject readTextMentionName(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textMentionName");
        o.add("text", r.readObject());
        o.addProperty("user_id", r.readLong());
        return o;
    }

    private static JsonObject readTextBankCard(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textBankCard");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextAutoPhone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textAutoPhone");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextAutoEmail(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textAutoEmail");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextAutoUrl(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textAutoUrl");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextCashtag(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textCashtag");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextBotCommand(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textBotCommand");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextHashtag(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textHashtag");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextMention(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textMention");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextSpoiler(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textSpoiler");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextCustomEmoji(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textCustomEmoji");
        o.addProperty("document_id", r.readLong());
        o.addProperty("alt", r.readString());
        return o;
    }

    private static JsonObject readTextMath(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textMath");
        o.addProperty("source", r.readString());
        return o;
    }

    private static JsonObject readTextAnchor(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textAnchor");
        o.add("text", r.readObject());
        o.addProperty("name", r.readString());
        return o;
    }

    private static JsonObject readTextImage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textImage");
        o.addProperty("document_id", r.readLong());
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        return o;
    }

    private static JsonObject readTextPhone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textPhone");
        o.add("text", r.readObject());
        o.addProperty("phone", r.readString());
        return o;
    }

    private static JsonObject readTextMarked(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textMarked");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextSuperscript(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textSuperscript");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextSubscript(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textSubscript");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextConcat(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textConcat");
        o.add("texts", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readTextEmail(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textEmail");
        o.add("text", r.readObject());
        o.addProperty("email", r.readString());
        return o;
    }

    private static JsonObject readTextUrl(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textUrl");
        o.add("text", r.readObject());
        o.addProperty("url", r.readString());
        o.addProperty("webpage_id", r.readLong());
        return o;
    }

    private static JsonObject readTextFixed(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textFixed");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextStrike(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textStrike");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextUnderline(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textUnderline");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextItalic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textItalic");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextBold(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textBold");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readTextPlain(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textPlain");
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readTextEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textEmpty");
        return o;
    }

    private static JsonObject readInputPageBlockMap(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPageBlockMap");
        o.add("geo", r.readObject());
        o.addProperty("zoom", r.readInt());
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageCaption(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageCaption");
        o.add("text", r.readObject());
        o.add("credit", r.readObject());
        return o;
    }

    private static JsonObject readInputGeoPoint(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputGeoPoint");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("lat", r.readDouble());
        o.addProperty("long", r.readDouble());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("accuracy_radius", r.readInt());
        }
        return o;
    }

    private static JsonObject readInputGeoPointEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputGeoPointEmpty");
        return o;
    }

    private static JsonObject readPageBlockThinking(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockThinking");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockMath(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockMath");
        o.addProperty("source", r.readString());
        return o;
    }

    private static JsonObject readPageBlockHeading6(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockHeading6");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockHeading5(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockHeading5");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockHeading4(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockHeading4");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockHeading3(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockHeading3");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockHeading2(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockHeading2");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockHeading1(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockHeading1");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockMap(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockMap");
        o.add("geo", r.readObject());
        o.addProperty("zoom", r.readInt());
        o.addProperty("w", r.readInt());
        o.addProperty("h", r.readInt());
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readGeoPoint(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "geoPoint");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("long", r.readDouble());
        o.addProperty("lat", r.readDouble());
        o.addProperty("access_hash", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("accuracy_radius", r.readInt());
        }
        return o;
    }

    private static JsonObject readGeoPointEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "geoPointEmpty");
        return o;
    }

    private static JsonObject readPageBlockRelatedArticles(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockRelatedArticles");
        o.add("title", r.readObject());
        o.add("articles", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPageRelatedArticle(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageRelatedArticle");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("url", r.readString());
        o.addProperty("webpage_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("description", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("photo_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("published_date", r.readInt());
        }
        return o;
    }

    private static JsonObject readPageBlockDetails(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockDetails");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("open", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        o.add("title", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockOrderedList(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockOrderedList");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("reversed", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.add("items", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("start", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("type", r.readString());
        }
        return o;
    }

    private static JsonObject readPageListOrderedItemBlocks(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageListOrderedItemBlocks");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("checkbox", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("checked", TLObject.hasFlag(flags, TLObject.FLAG_1));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("num", r.readString());
        }
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("value", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("type", r.readString());
        }
        return o;
    }

    private static JsonObject readPageBlockTable(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockTable");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("bordered", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("striped", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("title", r.readObject());
        o.add("rows", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPageTableRow(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageTableRow");
        o.add("cells", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPageTableCell(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageTableCell");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("header", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("align_center", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("align_right", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("valign_middle", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("valign_bottom", TLObject.hasFlag(flags, TLObject.FLAG_6));
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.add("text", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("colspan", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("rowspan", r.readInt());
        }
        return o;
    }

    private static JsonObject readPageBlockKicker(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockKicker");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockAudio(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockAudio");
        o.addProperty("audio_id", r.readLong());
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockChannel(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockChannel");
        o.add("channel", r.readObject());
        return o;
    }

    private static JsonObject readCommunity(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "community");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_12));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("collapsed_in_dialogs", TLObject.hasFlag(flags2, TLObject.FLAG_20));
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("access_hash", r.readLong());
        }
        o.addProperty("title", r.readString());
        o.add("photo", r.readObject());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.add("admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("default_banned_rights", r.readObject());
        }
        return o;
    }

    private static JsonObject readChatPhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatPhoto");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("has_video", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("photo_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("stripped_thumb", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        }
        o.addProperty("dc_id", r.readInt());
        return o;
    }

    private static JsonObject readChatPhotoEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatPhotoEmpty");
        return o;
    }

    private static JsonObject readCommunityForbidden(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "communityForbidden");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("access_hash", r.readLong());
        }
        o.addProperty("title", r.readString());
        return o;
    }

    private static JsonObject readChannelForbidden(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelForbidden");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("broadcast", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("megagroup", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("monoforum", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("title", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            o.addProperty("until_date", r.readInt());
        }
        return o;
    }

    private static JsonObject readChannel(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channel");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("broadcast", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("verified", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("megagroup", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("restricted", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("signatures", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_12));
        o.addProperty("scam", TLObject.hasFlag(flags, TLObject.FLAG_19));
        o.addProperty("has_link", TLObject.hasFlag(flags, TLObject.FLAG_20));
        o.addProperty("has_geo", TLObject.hasFlag(flags, TLObject.FLAG_21));
        o.addProperty("slowmode_enabled", TLObject.hasFlag(flags, TLObject.FLAG_22));
        o.addProperty("call_active", TLObject.hasFlag(flags, TLObject.FLAG_23));
        o.addProperty("call_not_empty", TLObject.hasFlag(flags, TLObject.FLAG_24));
        o.addProperty("fake", TLObject.hasFlag(flags, TLObject.FLAG_25));
        o.addProperty("gigagroup", TLObject.hasFlag(flags, TLObject.FLAG_26));
        o.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_27));
        o.addProperty("join_to_send", TLObject.hasFlag(flags, TLObject.FLAG_28));
        o.addProperty("join_request", TLObject.hasFlag(flags, TLObject.FLAG_29));
        o.addProperty("forum", TLObject.hasFlag(flags, TLObject.FLAG_30));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("stories_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        o.addProperty("stories_hidden_min", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        o.addProperty("stories_unavailable", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        o.addProperty("signature_profiles", TLObject.hasFlag(flags2, TLObject.FLAG_12));
        o.addProperty("autotranslation", TLObject.hasFlag(flags2, TLObject.FLAG_15));
        o.addProperty("broadcast_messages_allowed", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        o.addProperty("monoforum", TLObject.hasFlag(flags2, TLObject.FLAG_17));
        o.addProperty("forum_tabs", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("access_hash", r.readLong());
        }
        o.addProperty("title", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("username", r.readString());
        }
        o.add("photo", r.readObject());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.add("admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.add("banned_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("default_banned_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.addProperty("participants_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            o.add("usernames", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            o.add("stories_max_id", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            o.add("color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            o.add("profile_color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            o.add("emoji_status", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            o.addProperty("level", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            o.addProperty("subscription_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_13)) {
            o.addProperty("bot_verification_icon", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            o.addProperty("send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            o.addProperty("linked_monoforum_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_20)) {
            o.addProperty("linked_community_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readRecentStory(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "recentStory");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("live", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("max_id", r.readInt());
        }
        return o;
    }

    private static JsonObject readUsername(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "username");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("editable", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("active", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("username", r.readString());
        return o;
    }

    private static JsonObject readRestrictionReason(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "restrictionReason");
        o.addProperty("platform", r.readString());
        o.addProperty("reason", r.readString());
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readChatForbidden(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatForbidden");
        o.addProperty("id", r.readLong());
        o.addProperty("title", r.readString());
        return o;
    }

    private static JsonObject readChat(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chat");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("deactivated", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("call_active", TLObject.hasFlag(flags, TLObject.FLAG_23));
        o.addProperty("call_not_empty", TLObject.hasFlag(flags, TLObject.FLAG_24));
        o.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_25));
        o.addProperty("id", r.readLong());
        o.addProperty("title", r.readString());
        o.add("photo", r.readObject());
        o.addProperty("participants_count", r.readInt());
        o.addProperty("date", r.readInt());
        o.addProperty("version", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("migrated_to", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.add("admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("default_banned_rights", r.readObject());
        }
        return o;
    }

    private static JsonObject readInputChannelFromMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputChannelFromMessage");
        o.add("peer", r.readObject());
        o.addProperty("msg_id", r.readInt());
        o.addProperty("channel_id", r.readLong());
        return o;
    }

    private static JsonObject readInputPeerChannelFromMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPeerChannelFromMessage");
        o.add("peer", r.readObject());
        o.addProperty("msg_id", r.readInt());
        o.addProperty("channel_id", r.readLong());
        return o;
    }

    private static JsonObject readInputPeerUserFromMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPeerUserFromMessage");
        o.add("peer", r.readObject());
        o.addProperty("msg_id", r.readInt());
        o.addProperty("user_id", r.readLong());
        return o;
    }

    private static JsonObject readInputPeerChannel(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPeerChannel");
        o.addProperty("channel_id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        return o;
    }

    private static JsonObject readInputPeerUser(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPeerUser");
        o.addProperty("user_id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        return o;
    }

    private static JsonObject readInputPeerChat(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPeerChat");
        o.addProperty("chat_id", r.readLong());
        return o;
    }

    private static JsonObject readInputPeerSelf(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPeerSelf");
        return o;
    }

    private static JsonObject readInputPeerEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPeerEmpty");
        return o;
    }

    private static JsonObject readInputChannel(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputChannel");
        o.addProperty("channel_id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        return o;
    }

    private static JsonObject readInputChannelEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputChannelEmpty");
        return o;
    }

    private static JsonObject readChatEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatEmpty");
        o.addProperty("id", r.readLong());
        return o;
    }

    private static JsonObject readPageBlockSlideshow(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockSlideshow");
        o.add("items", r.readVector(TlBinaryReader::readObject));
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockCollage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockCollage");
        o.add("items", r.readVector(TlBinaryReader::readObject));
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockEmbedPost(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockEmbedPost");
        o.addProperty("url", r.readString());
        o.addProperty("webpage_id", r.readLong());
        o.addProperty("author_photo_id", r.readLong());
        o.addProperty("author", r.readString());
        o.addProperty("date", r.readInt());
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockEmbed(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockEmbed");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("full_width", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("allow_scrolling", TLObject.hasFlag(flags, TLObject.FLAG_3));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("html", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("poster_photo_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("w", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("h", r.readInt());
        }
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockCover(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockCover");
        o.add("cover", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockVideo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockVideo");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("autoplay", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("loop", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("video_id", r.readLong());
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockPhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockPhoto");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("photo_id", r.readLong());
        o.add("caption", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("webpage_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readPageBlockPullquote(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockPullquote");
        o.add("text", r.readObject());
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockBlockquote(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockBlockquote");
        o.add("text", r.readObject());
        o.add("caption", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockList(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockList");
        o.add("items", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPageListItemBlocks(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageListItemBlocks");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("checkbox", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("checked", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPageBlockAnchor(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockAnchor");
        o.addProperty("name", r.readString());
        return o;
    }

    private static JsonObject readPageBlockDivider(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockDivider");
        return o;
    }

    private static JsonObject readPageBlockFooter(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockFooter");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockPreformatted(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockPreformatted");
        o.add("text", r.readObject());
        o.addProperty("language", r.readString());
        return o;
    }

    private static JsonObject readPageBlockParagraph(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockParagraph");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockSubheader(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockSubheader");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockHeader(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockHeader");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockAuthorDate(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockAuthorDate");
        o.add("author", r.readObject());
        o.addProperty("published_date", r.readInt());
        return o;
    }

    private static JsonObject readPageBlockSubtitle(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockSubtitle");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockTitle(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockTitle");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageBlockUnsupported(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockUnsupported");
        return o;
    }

    private static JsonObject readPageListItemText(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageListItemText");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("checkbox", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("checked", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageListOrderedItemText(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageListOrderedItemText");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("checkbox", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("checked", TLObject.hasFlag(flags, TLObject.FLAG_1));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("num", r.readString());
        }
        o.add("text", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("value", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("type", r.readString());
        }
        return o;
    }

    private static JsonObject readSuggestedPost(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "suggestedPost");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("accepted", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("rejected", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("price", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("schedule_date", r.readInt());
        }
        return o;
    }

    private static JsonObject readStarsTonAmount(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starsTonAmount");
        o.addProperty("amount", r.readLong());
        return o;
    }

    private static JsonObject readStarsAmount(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starsAmount");
        o.addProperty("amount", r.readLong());
        o.addProperty("nanos", r.readInt());
        return o;
    }

    private static JsonObject readInputMediaStakeDice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaStakeDice");
        o.addProperty("game_hash", r.readString());
        o.addProperty("ton_amount", r.readLong());
        o.addProperty("client_seed", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readInputMediaTodo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaTodo");
        o.add("todo", r.readObject());
        return o;
    }

    private static JsonObject readTodoList(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "todoList");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("others_can_append", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("others_can_complete", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("title", r.readObject());
        o.add("list", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readTodoItem(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "todoItem");
        o.addProperty("id", r.readInt());
        o.add("title", r.readObject());
        return o;
    }

    private static JsonObject readTextWithEntities(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "textWithEntities");
        o.addProperty("text", r.readString());
        o.add("entities", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readMessageEntityDiffDelete(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityDiffDelete");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityDiffReplace(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityDiffReplace");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        o.addProperty("old_text", r.readString());
        return o;
    }

    private static JsonObject readMessageEntityDiffInsert(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityDiffInsert");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityFormattedDate(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityFormattedDate");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("relative", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("short_time", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("long_time", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("short_date", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("long_date", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("day_of_week", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        o.addProperty("date", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityBlockquote(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityBlockquote");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("collapsed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityCustomEmoji(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityCustomEmoji");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        o.addProperty("document_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageEntitySpoiler(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntitySpoiler");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityBankCard(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityBankCard");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityStrike(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityStrike");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityUnderline(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityUnderline");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityCashtag(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityCashtag");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityPhone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityPhone");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readInputMessageEntityMentionName(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMessageEntityMentionName");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        o.add("user_id", r.readObject());
        return o;
    }

    private static JsonObject readInputUserFromMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputUserFromMessage");
        o.add("peer", r.readObject());
        o.addProperty("msg_id", r.readInt());
        o.addProperty("user_id", r.readLong());
        return o;
    }

    private static JsonObject readInputUser(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputUser");
        o.addProperty("user_id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        return o;
    }

    private static JsonObject readInputUserSelf(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputUserSelf");
        return o;
    }

    private static JsonObject readInputUserEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputUserEmpty");
        return o;
    }

    private static JsonObject readMessageEntityMentionName(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityMentionName");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        o.addProperty("user_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageEntityTextUrl(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityTextUrl");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        o.addProperty("url", r.readString());
        return o;
    }

    private static JsonObject readMessageEntityPre(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityPre");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        o.addProperty("language", r.readString());
        return o;
    }

    private static JsonObject readMessageEntityCode(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityCode");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityItalic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityItalic");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityBold(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityBold");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityEmail(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityEmail");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityUrl(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityUrl");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityBotCommand(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityBotCommand");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityHashtag(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityHashtag");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityMention(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityMention");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readMessageEntityUnknown(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEntityUnknown");
        o.addProperty("offset", r.readInt());
        o.addProperty("length", r.readInt());
        return o;
    }

    private static JsonObject readInputMediaPaidMedia(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaPaidMedia");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("stars_amount", r.readLong());
        o.add("extended_media", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("payload", r.readString());
        }
        return o;
    }

    private static JsonObject readInputMediaWebPage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaWebPage");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("force_large_media", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("force_small_media", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("optional", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("url", r.readString());
        return o;
    }

    private static JsonObject readInputMediaStory(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaStory");
        o.add("peer", r.readObject());
        o.addProperty("id", r.readInt());
        return o;
    }

    private static JsonObject readInputMediaDice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaDice");
        o.addProperty("emoticon", r.readString());
        return o;
    }

    private static JsonObject readInputMediaPoll(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaPoll");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("poll", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("correct_answers", r.readVector(TlBinaryReader::readInt));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("attached_media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("solution", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("solution_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("solution_media", r.readObject());
        }
        return o;
    }

    private static JsonObject readInputMediaGeoLive(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaGeoLive");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("stopped", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.add("geo_point", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("heading", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("proximity_notification_radius", r.readInt());
        }
        return o;
    }

    private static JsonObject readInputMediaInvoice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaInvoice");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("title", r.readString());
        o.addProperty("description", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("photo", r.readObject());
        }
        o.add("invoice", r.readObject());
        o.addProperty("payload", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("provider", r.readString());
        }
        o.add("provider_data", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("start_param", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("extended_media", r.readObject());
        }
        return o;
    }

    private static JsonObject readInputMediaGame(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaGame");
        o.add("id", r.readObject());
        return o;
    }

    private static JsonObject readInputGameShortName(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputGameShortName");
        o.add("bot_id", r.readObject());
        o.addProperty("short_name", r.readString());
        return o;
    }

    private static JsonObject readInputGameID(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputGameID");
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        return o;
    }

    private static JsonObject readInputMediaDocumentExternal(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaDocumentExternal");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("url", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("video_cover", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("video_timestamp", r.readInt());
        }
        return o;
    }

    private static JsonObject readInputPhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPhoto");
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("file_reference", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readInputPhotoEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPhotoEmpty");
        return o;
    }

    private static JsonObject readInputMediaPhotoExternal(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaPhotoExternal");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("url", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("ttl_seconds", r.readInt());
        }
        return o;
    }

    private static JsonObject readInputMediaVenue(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaVenue");
        o.add("geo_point", r.readObject());
        o.addProperty("title", r.readString());
        o.addProperty("address", r.readString());
        o.addProperty("provider", r.readString());
        o.addProperty("venue_id", r.readString());
        o.addProperty("venue_type", r.readString());
        return o;
    }

    private static JsonObject readInputMediaDocument(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaDocument");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.add("id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("video_cover", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("video_timestamp", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("query", r.readString());
        }
        return o;
    }

    private static JsonObject readInputDocument(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputDocument");
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("file_reference", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readInputDocumentEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputDocumentEmpty");
        return o;
    }

    private static JsonObject readInputMediaUploadedDocument(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaUploadedDocument");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("nosound_video", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("force_file", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.add("file", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("thumb", r.readObject());
        }
        o.addProperty("mime_type", r.readString());
        o.add("attributes", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("stickers", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("video_cover", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("video_timestamp", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("ttl_seconds", r.readInt());
        }
        return o;
    }

    private static JsonObject readInputFileStoryDocument(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputFileStoryDocument");
        o.add("id", r.readObject());
        return o;
    }

    private static JsonObject readInputFileBig(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputFileBig");
        o.addProperty("id", r.readLong());
        o.addProperty("parts", r.readInt());
        o.addProperty("name", r.readString());
        return o;
    }

    private static JsonObject readInputFile(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputFile");
        o.addProperty("id", r.readLong());
        o.addProperty("parts", r.readInt());
        o.addProperty("name", r.readString());
        o.addProperty("md5_checksum", r.readString());
        return o;
    }

    private static JsonObject readInputMediaContact(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaContact");
        o.addProperty("phone_number", r.readString());
        o.addProperty("first_name", r.readString());
        o.addProperty("last_name", r.readString());
        o.addProperty("vcard", r.readString());
        return o;
    }

    private static JsonObject readInputMediaGeoPoint(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaGeoPoint");
        o.add("geo_point", r.readObject());
        return o;
    }

    private static JsonObject readInputMediaPhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaPhoto");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("live_photo", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.add("id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("video", r.readObject());
        }
        return o;
    }

    private static JsonObject readInputMediaUploadedPhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaUploadedPhoto");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("live_photo", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.add("file", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("stickers", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("video", r.readObject());
        }
        return o;
    }

    private static JsonObject readInputMediaEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaEmpty");
        return o;
    }

    private static JsonObject readDataJSON(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "dataJSON");
        o.addProperty("data", r.readString());
        return o;
    }

    private static JsonObject readInvoice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "invoice");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("test", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("name_requested", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("phone_requested", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("email_requested", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("shipping_address_requested", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("flexible", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("phone_to_provider", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("email_to_provider", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("recurring", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("currency", r.readString());
        o.add("prices", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("max_tip_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("suggested_tip_amounts", r.readVector(TlBinaryReader::readLong));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("terms_url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("subscription_period", r.readInt());
        }
        return o;
    }

    private static JsonObject readLabeledPrice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "labeledPrice");
        o.addProperty("label", r.readString());
        o.addProperty("amount", r.readLong());
        return o;
    }

    private static JsonObject readInputWebDocument(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputWebDocument");
        o.addProperty("url", r.readString());
        o.addProperty("size", r.readInt());
        o.addProperty("mime_type", r.readString());
        o.add("attributes", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPoll(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "poll");
        o.addProperty("id", r.readLong());
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("closed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("public_voters", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("multiple_choice", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("quiz", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("open_answers", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("revoting_disabled", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("shuffle_answers", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("hide_results_until_close", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("subscribers_only", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.add("question", r.readObject());
        o.add("answers", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("close_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("close_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.add("countries_iso2", r.readVector(TlBinaryReader::readString));
        }
        o.addProperty("hash", r.readLong());
        return o;
    }

    private static JsonObject readInputPollAnswer(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputPollAnswer");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("text", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("media", r.readObject());
        }
        return o;
    }

    private static JsonObject readPollAnswer(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pollAnswer");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("text", r.readObject());
        o.addProperty("option", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("added_by", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("date", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageMediaVideoStream(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaVideoStream");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("rtmp_stream", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.add("call", r.readObject());
        return o;
    }

    private static JsonObject readInputGroupCallInviteMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputGroupCallInviteMessage");
        o.addProperty("msg_id", r.readInt());
        return o;
    }

    private static JsonObject readInputGroupCallSlug(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputGroupCallSlug");
        o.addProperty("slug", r.readString());
        return o;
    }

    private static JsonObject readInputGroupCall(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputGroupCall");
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        return o;
    }

    private static JsonObject readMessageMediaToDo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaToDo");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("todo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("completions", r.readVector(TlBinaryReader::readObject));
        }
        return o;
    }

    private static JsonObject readTodoCompletion(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "todoCompletion");
        o.addProperty("id", r.readInt());
        o.add("completed_by", r.readObject());
        o.addProperty("date", r.readInt());
        return o;
    }

    private static JsonObject readMessageMediaPaidMedia(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaPaidMedia");
        o.addProperty("stars_amount", r.readLong());
        o.add("extended_media", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readMessageExtendedMedia(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageExtendedMedia");
        o.add("media", r.readObject());
        return o;
    }

    private static JsonObject readMessageMediaGiveawayResults(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaGiveawayResults");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("only_new_subscribers", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("refunded", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("channel_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("additional_peers_count", r.readInt());
        }
        o.addProperty("launch_msg_id", r.readInt());
        o.addProperty("winners_count", r.readInt());
        o.addProperty("unclaimed_count", r.readInt());
        o.add("winners", r.readVector(TlBinaryReader::readLong));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("months", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("prize_description", r.readString());
        }
        o.addProperty("until_date", r.readInt());
        return o;
    }

    private static JsonObject readMessageMediaGiveaway(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaGiveaway");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("only_new_subscribers", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("winners_are_visible", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.add("channels", r.readVector(TlBinaryReader::readLong));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("countries_iso2", r.readVector(TlBinaryReader::readString));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("prize_description", r.readString());
        }
        o.addProperty("quantity", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("months", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("stars", r.readLong());
        }
        o.addProperty("until_date", r.readInt());
        return o;
    }

    private static JsonObject readMessageMediaStory(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaStory");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("via_mention", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("peer", r.readObject());
        o.addProperty("id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("story", r.readObject());
        }
        return o;
    }

    private static JsonObject readStoryItem(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "storyItem");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("public", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("close_friends", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("edited", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("contacts", TLObject.hasFlag(flags, TLObject.FLAG_12));
        o.addProperty("selected_contacts", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_16));
        o.addProperty("id", r.readInt());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.add("fwd_from", r.readObject());
        }
        o.addProperty("expire_date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("caption", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("entities", r.readVector(TlBinaryReader::readObject));
        }
        o.add("media", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.add("media_areas", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("privacy", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("views", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.add("sent_reaction", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_19)) {
            o.add("albums", r.readVector(TlBinaryReader::readInt));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            o.add("music", r.readObject());
        }
        return o;
    }

    private static JsonObject readReactionPaid(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "reactionPaid");
        return o;
    }

    private static JsonObject readReactionCustomEmoji(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "reactionCustomEmoji");
        o.addProperty("document_id", r.readLong());
        return o;
    }

    private static JsonObject readReactionEmoji(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "reactionEmoji");
        o.addProperty("emoticon", r.readString());
        return o;
    }

    private static JsonObject readReactionEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "reactionEmpty");
        return o;
    }

    private static JsonObject readStoryViews(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "storyViews");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("has_viewers", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("views_count", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("forwards_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("reactions", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("reactions_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("recent_viewers", r.readVector(TlBinaryReader::readLong));
        }
        return o;
    }

    private static JsonObject readReactionCount(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "reactionCount");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("chosen_order", r.readInt());
        }
        o.add("reaction", r.readObject());
        o.addProperty("count", r.readInt());
        return o;
    }

    private static JsonObject readPrivacyValueDisallowBots(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueDisallowBots");
        return o;
    }

    private static JsonObject readPrivacyValueAllowBots(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueAllowBots");
        return o;
    }

    private static JsonObject readPrivacyValueAllowPremium(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueAllowPremium");
        return o;
    }

    private static JsonObject readPrivacyValueAllowCloseFriends(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueAllowCloseFriends");
        return o;
    }

    private static JsonObject readPrivacyValueDisallowChatParticipants(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueDisallowChatParticipants");
        o.add("chats", r.readVector(TlBinaryReader::readLong));
        return o;
    }

    private static JsonObject readPrivacyValueAllowChatParticipants(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueAllowChatParticipants");
        o.add("chats", r.readVector(TlBinaryReader::readLong));
        return o;
    }

    private static JsonObject readPrivacyValueDisallowUsers(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueDisallowUsers");
        o.add("users", r.readVector(TlBinaryReader::readLong));
        return o;
    }

    private static JsonObject readPrivacyValueDisallowAll(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueDisallowAll");
        return o;
    }

    private static JsonObject readPrivacyValueDisallowContacts(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueDisallowContacts");
        return o;
    }

    private static JsonObject readPrivacyValueAllowUsers(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueAllowUsers");
        o.add("users", r.readVector(TlBinaryReader::readLong));
        return o;
    }

    private static JsonObject readPrivacyValueAllowAll(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueAllowAll");
        return o;
    }

    private static JsonObject readPrivacyValueAllowContacts(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "privacyValueAllowContacts");
        return o;
    }

    private static JsonObject readMediaAreaStarGift(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "mediaAreaStarGift");
        o.add("coordinates", r.readObject());
        o.addProperty("slug", r.readString());
        return o;
    }

    private static JsonObject readMediaAreaCoordinates(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "mediaAreaCoordinates");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("x", r.readDouble());
        o.addProperty("y", r.readDouble());
        o.addProperty("w", r.readDouble());
        o.addProperty("h", r.readDouble());
        o.addProperty("rotation", r.readDouble());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("radius", r.readDouble());
        }
        return o;
    }

    private static JsonObject readMediaAreaWeather(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "mediaAreaWeather");
        o.add("coordinates", r.readObject());
        o.addProperty("emoji", r.readString());
        o.addProperty("temperature_c", r.readDouble());
        o.addProperty("color", r.readInt());
        return o;
    }

    private static JsonObject readMediaAreaUrl(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "mediaAreaUrl");
        o.add("coordinates", r.readObject());
        o.addProperty("url", r.readString());
        return o;
    }

    private static JsonObject readInputMediaAreaChannelPost(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaAreaChannelPost");
        o.add("coordinates", r.readObject());
        o.add("channel", r.readObject());
        o.addProperty("msg_id", r.readInt());
        return o;
    }

    private static JsonObject readMediaAreaChannelPost(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "mediaAreaChannelPost");
        o.add("coordinates", r.readObject());
        o.addProperty("channel_id", r.readLong());
        o.addProperty("msg_id", r.readInt());
        return o;
    }

    private static JsonObject readMediaAreaSuggestedReaction(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "mediaAreaSuggestedReaction");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("dark", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("flipped", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("coordinates", r.readObject());
        o.add("reaction", r.readObject());
        return o;
    }

    private static JsonObject readMediaAreaGeoPoint(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "mediaAreaGeoPoint");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("coordinates", r.readObject());
        o.add("geo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("address", r.readObject());
        }
        return o;
    }

    private static JsonObject readGeoPointAddress(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "geoPointAddress");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("country_iso2", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("state", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("city", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("street", r.readString());
        }
        return o;
    }

    private static JsonObject readInputMediaAreaVenue(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputMediaAreaVenue");
        o.add("coordinates", r.readObject());
        o.addProperty("query_id", r.readLong());
        o.addProperty("result_id", r.readString());
        return o;
    }

    private static JsonObject readMediaAreaVenue(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "mediaAreaVenue");
        o.add("coordinates", r.readObject());
        o.add("geo", r.readObject());
        o.addProperty("title", r.readString());
        o.addProperty("address", r.readString());
        o.addProperty("provider", r.readString());
        o.addProperty("venue_id", r.readString());
        o.addProperty("venue_type", r.readString());
        return o;
    }

    private static JsonObject readMessageMediaDice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaDice");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("value", r.readInt());
        o.addProperty("emoticon", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("game_outcome", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessages_emojiGameOutcome(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messages.emojiGameOutcome");
        o.addProperty("seed", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        o.addProperty("stake_ton_amount", r.readLong());
        o.addProperty("ton_amount", r.readLong());
        return o;
    }

    private static JsonObject readMessageMediaPoll(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaPoll");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("poll", r.readObject());
        o.add("results", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("attached_media", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessageMediaGeoLive(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaGeoLive");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("geo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("heading", r.readInt());
        }
        o.addProperty("period", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("proximity_notification_radius", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageMediaInvoice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaInvoice");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("shipping_address_requested", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("test", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("title", r.readString());
        o.addProperty("description", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("receipt_msg_id", r.readInt());
        }
        o.addProperty("currency", r.readString());
        o.addProperty("total_amount", r.readLong());
        o.addProperty("start_param", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("extended_media", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessageExtendedMediaPreview(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageExtendedMediaPreview");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("w", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("h", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("thumb", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("video_duration", r.readInt());
        }
        return o;
    }

    private static JsonObject readWebDocumentNoProxy(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webDocumentNoProxy");
        o.addProperty("url", r.readString());
        o.addProperty("size", r.readInt());
        o.addProperty("mime_type", r.readString());
        o.add("attributes", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readWebDocument(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webDocument");
        o.addProperty("url", r.readString());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("size", r.readInt());
        o.addProperty("mime_type", r.readString());
        o.add("attributes", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readMessageMediaGame(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaGame");
        o.add("game", r.readObject());
        return o;
    }

    private static JsonObject readGame(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "game");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("short_name", r.readString());
        o.addProperty("title", r.readString());
        o.addProperty("description", r.readString());
        o.add("photo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("document", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessageMediaVenue(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaVenue");
        o.add("geo", r.readObject());
        o.addProperty("title", r.readString());
        o.addProperty("address", r.readString());
        o.addProperty("provider", r.readString());
        o.addProperty("venue_id", r.readString());
        o.addProperty("venue_type", r.readString());
        return o;
    }

    private static JsonObject readMessageMediaWebPage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaWebPage");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("force_large_media", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("force_small_media", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("manual", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("safe", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.add("webpage", r.readObject());
        return o;
    }

    private static JsonObject readWebPageNotModified(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageNotModified");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("cached_page_views", r.readInt());
        }
        return o;
    }

    private static JsonObject readWebPage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPage");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("has_large_media", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("video_cover_photo", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("id", r.readLong());
        o.addProperty("url", r.readString());
        o.addProperty("display_url", r.readString());
        o.addProperty("hash", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("type", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("site_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("description", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("embed_url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("embed_type", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("embed_width", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("embed_height", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("duration", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("document", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("cached_page", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.add("attributes", r.readVector(TlBinaryReader::readObject));
        }
        return o;
    }

    private static JsonObject readWebPageAttributeAiComposeTone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageAttributeAiComposeTone");
        o.addProperty("emoji_id", r.readLong());
        return o;
    }

    private static JsonObject readWebPageAttributeStarGiftAuction(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageAttributeStarGiftAuction");
        o.add("gift", r.readObject());
        o.addProperty("end_date", r.readInt());
        return o;
    }

    private static JsonObject readStarGiftUnique(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftUnique");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("require_premium", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("resale_ton_only", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("theme_available", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("burned", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("crafted", TLObject.hasFlag(flags, TLObject.FLAG_15));
        o.addProperty("id", r.readLong());
        o.addProperty("gift_id", r.readLong());
        o.addProperty("title", r.readString());
        o.addProperty("slug", r.readString());
        o.addProperty("num", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("owner_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("owner_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("owner_address", r.readString());
        }
        o.add("attributes", r.readVector(TlBinaryReader::readObject));
        o.addProperty("availability_issued", r.readInt());
        o.addProperty("availability_total", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("gift_address", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("resell_amount", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("released_by", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("value_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("value_currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("value_usd_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("theme_peer", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.add("peer_color", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.add("host_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("offer_min_stars", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            o.addProperty("craft_chance_permille", r.readInt());
        }
        return o;
    }

    private static JsonObject readStarGiftAttributeOriginalDetails(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributeOriginalDetails");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("sender_id", r.readObject());
        }
        o.add("recipient_id", r.readObject());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("message", r.readObject());
        }
        return o;
    }

    private static JsonObject readStarGiftAttributeBackdrop(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributeBackdrop");
        o.addProperty("name", r.readString());
        o.addProperty("backdrop_id", r.readInt());
        o.addProperty("center_color", r.readInt());
        o.addProperty("edge_color", r.readInt());
        o.addProperty("pattern_color", r.readInt());
        o.addProperty("text_color", r.readInt());
        o.add("rarity", r.readObject());
        return o;
    }

    private static JsonObject readStarGiftAttributeRarityLegendary(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributeRarityLegendary");
        return o;
    }

    private static JsonObject readStarGiftAttributeRarityEpic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributeRarityEpic");
        return o;
    }

    private static JsonObject readStarGiftAttributeRarityRare(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributeRarityRare");
        return o;
    }

    private static JsonObject readStarGiftAttributeRarityUncommon(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributeRarityUncommon");
        return o;
    }

    private static JsonObject readStarGiftAttributeRarity(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributeRarity");
        o.addProperty("permille", r.readInt());
        return o;
    }

    private static JsonObject readStarGiftAttributePattern(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributePattern");
        o.addProperty("name", r.readString());
        o.add("document", r.readObject());
        o.add("rarity", r.readObject());
        return o;
    }

    private static JsonObject readStarGiftAttributeModel(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftAttributeModel");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("crafted", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("name", r.readString());
        o.add("document", r.readObject());
        o.add("rarity", r.readObject());
        return o;
    }

    private static JsonObject readStarGift(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGift");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("limited", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("sold_out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("birthday", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("require_premium", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("limited_per_user", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("peer_color_available", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("auction", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("id", r.readLong());
        o.add("sticker", r.readObject());
        o.addProperty("stars", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("availability_remains", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("availability_total", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("availability_resale", r.readLong());
        }
        o.addProperty("convert_stars", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("first_sale_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("last_sale_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("upgrade_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("resell_min_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("released_by", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("per_user_total", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("per_user_remains", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.addProperty("locked_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("auction_slug", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("gifts_per_round", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("auction_start_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.addProperty("upgrade_variants", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.add("background", r.readObject());
        }
        return o;
    }

    private static JsonObject readStarGiftBackground(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starGiftBackground");
        o.addProperty("center_color", r.readInt());
        o.addProperty("edge_color", r.readInt());
        o.addProperty("text_color", r.readInt());
        return o;
    }

    private static JsonObject readWebPageAttributeStarGiftCollection(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageAttributeStarGiftCollection");
        o.add("icons", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readWebPageAttributeUniqueStarGift(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageAttributeUniqueStarGift");
        o.add("gift", r.readObject());
        return o;
    }

    private static JsonObject readWebPageAttributeStickerSet(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageAttributeStickerSet");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("emojis", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("text_color", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("stickers", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readWebPageAttributeStory(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageAttributeStory");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("peer", r.readObject());
        o.addProperty("id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("story", r.readObject());
        }
        return o;
    }

    private static JsonObject readStoryItemSkipped(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "storyItemSkipped");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("close_friends", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("live", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("id", r.readInt());
        o.addProperty("date", r.readInt());
        o.addProperty("expire_date", r.readInt());
        return o;
    }

    private static JsonObject readStoryItemDeleted(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "storyItemDeleted");
        o.addProperty("id", r.readInt());
        return o;
    }

    private static JsonObject readWebPageAttributeTheme(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageAttributeTheme");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("documents", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("settings", r.readObject());
        }
        return o;
    }

    private static JsonObject readThemeSettings(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "themeSettings");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("message_colors_animated", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.add("base_theme", r.readObject());
        o.addProperty("accent_color", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("outbox_accent_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("message_colors", r.readVector(TlBinaryReader::readInt));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("wallpaper", r.readObject());
        }
        return o;
    }

    private static JsonObject readBaseThemeArctic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "baseThemeArctic");
        return o;
    }

    private static JsonObject readBaseThemeTinted(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "baseThemeTinted");
        return o;
    }

    private static JsonObject readBaseThemeNight(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "baseThemeNight");
        return o;
    }

    private static JsonObject readBaseThemeDay(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "baseThemeDay");
        return o;
    }

    private static JsonObject readBaseThemeClassic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "baseThemeClassic");
        return o;
    }

    private static JsonObject readPage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "page");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("part", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("rtl", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("v2", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("url", r.readString());
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        o.add("photos", r.readVector(TlBinaryReader::readObject));
        o.add("documents", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("views", r.readInt());
        }
        return o;
    }

    private static JsonObject readWebPagePending(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPagePending");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("url", r.readString());
        }
        o.addProperty("date", r.readInt());
        return o;
    }

    private static JsonObject readWebPageEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "webPageEmpty");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("url", r.readString());
        }
        return o;
    }

    private static JsonObject readMessageMediaDocument(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaDocument");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("nopremium", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("video", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("round", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("voice", TLObject.hasFlag(flags, TLObject.FLAG_8));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("document", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("alt_documents", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("video_cover", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("video_timestamp", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("ttl_seconds", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageMediaUnsupported(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaUnsupported");
        return o;
    }

    private static JsonObject readMessageMediaContact(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaContact");
        o.addProperty("phone_number", r.readString());
        o.addProperty("first_name", r.readString());
        o.addProperty("last_name", r.readString());
        o.addProperty("vcard", r.readString());
        o.addProperty("user_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageMediaGeo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaGeo");
        o.add("geo", r.readObject());
        return o;
    }

    private static JsonObject readMessageMediaPhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaPhoto");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("spoiler", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("live_photo", TLObject.hasFlag(flags, TLObject.FLAG_4));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("ttl_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("video", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessageMediaEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageMediaEmpty");
        return o;
    }

    private static JsonObject readPollResults(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pollResults");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("has_unread_votes", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("can_view_stats", TLObject.hasFlag(flags, TLObject.FLAG_7));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("results", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("total_voters", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("recent_voters", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("solution", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("solution_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("solution_media", r.readObject());
        }
        return o;
    }

    private static JsonObject readPollAnswerVoters(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pollAnswerVoters");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("chosen", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("correct", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("option", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("voters", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("recent_voters", r.readVector(TlBinaryReader::readObject));
        }
        return o;
    }

    private static JsonObject readStoryFwdHeader(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "storyFwdHeader");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("modified", TLObject.hasFlag(flags, TLObject.FLAG_3));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("from_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("story_id", r.readInt());
        }
        return o;
    }

    private static JsonObject readInputReplyToEphemeralMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputReplyToEphemeralMessage");
        o.addProperty("id", r.readInt());
        return o;
    }

    private static JsonObject readInputReplyToMonoForum(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputReplyToMonoForum");
        o.add("monoforum_peer_id", r.readObject());
        return o;
    }

    private static JsonObject readInputReplyToStory(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputReplyToStory");
        o.add("peer", r.readObject());
        o.addProperty("story_id", r.readInt());
        return o;
    }

    private static JsonObject readInputReplyToMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputReplyToMessage");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("reply_to_msg_id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("top_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("reply_to_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("quote_text", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("quote_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("quote_offset", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("monoforum_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("todo_item_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("poll_option", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        }
        return o;
    }

    private static JsonObject readDraftMessageEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "draftMessageEmpty");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("date", r.readInt());
        }
        return o;
    }

    private static JsonObject readPeerNotifySettings(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "peerNotifySettings");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("show_previews", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("silent", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("mute_until", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("ios_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("android_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("other_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("stories_muted", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("stories_hide_sender", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("stories_ios_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("stories_android_sound", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("stories_other_sound", r.readObject());
        }
        return o;
    }

    private static JsonObject readNotificationSoundRingtone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "notificationSoundRingtone");
        o.addProperty("id", r.readLong());
        return o;
    }

    private static JsonObject readNotificationSoundLocal(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "notificationSoundLocal");
        o.addProperty("title", r.readString());
        o.addProperty("data", r.readString());
        return o;
    }

    private static JsonObject readNotificationSoundNone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "notificationSoundNone");
        return o;
    }

    private static JsonObject readNotificationSoundDefault(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "notificationSoundDefault");
        return o;
    }

    private static JsonObject readForumTopicDeleted(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "forumTopicDeleted");
        o.addProperty("id", r.readInt());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionDeleteTopic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionDeleteTopic");
        o.add("topic", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionEditTopic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionEditTopic");
        o.add("prev_topic", r.readObject());
        o.add("new_topic", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionCreateTopic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionCreateTopic");
        o.add("topic", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleForum(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleForum");
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeUsernames(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeUsernames");
        o.add("prev_value", r.readVector(TlBinaryReader::readString));
        o.add("new_value", r.readVector(TlBinaryReader::readString));
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeAvailableReactions(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeAvailableReactions");
        o.add("prev_value", r.readObject());
        o.add("new_value", r.readObject());
        return o;
    }

    private static JsonObject readChatReactionsSome(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatReactionsSome");
        o.add("reactions", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readChatReactionsAll(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatReactionsAll");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("allow_custom", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return o;
    }

    private static JsonObject readChatReactionsNone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatReactionsNone");
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionSendMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionSendMessage");
        o.add("message", r.readObject());
        return o;
    }

    private static JsonObject readMessageService(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageService");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("mentioned", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("media_unread", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("reactions_are_possible", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("silent", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("post", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("legacy", TLObject.hasFlag(flags, TLObject.FLAG_19));
        o.addProperty("id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("from_id", r.readObject());
        }
        o.add("peer_id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            o.add("saved_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("reply_to", r.readObject());
        }
        o.addProperty("date", r.readInt());
        o.add("action", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            o.add("reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            o.addProperty("ttl_period", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageReactions(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageReactions");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("can_see_list", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("reactions_as_tags", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.add("results", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("recent_reactions", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("top_reactors", r.readVector(TlBinaryReader::readObject));
        }
        return o;
    }

    private static JsonObject readMessageReactor(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageReactor");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("top", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("my", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("anonymous", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("peer_id", r.readObject());
        }
        o.addProperty("count", r.readInt());
        return o;
    }

    private static JsonObject readMessagePeerReaction(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messagePeerReaction");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("big", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("unread", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("my", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.add("peer_id", r.readObject());
        o.addProperty("date", r.readInt());
        o.add("reaction", r.readObject());
        return o;
    }

    private static JsonObject readMessageActionChangeCommunity(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChangeCommunity");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("community_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readMessageActionManagedBotCreated(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionManagedBotCreated");
        o.addProperty("bot_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionPollDeleteAnswer(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPollDeleteAnswer");
        o.add("answer", r.readObject());
        return o;
    }

    private static JsonObject readMessageActionPollAppendAnswer(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPollAppendAnswer");
        o.add("answer", r.readObject());
        return o;
    }

    private static JsonObject readMessageActionNoForwardsRequest(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionNoForwardsRequest");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("expired", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("prev_value", r.readBoolean());
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readMessageActionNoForwardsToggle(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionNoForwardsToggle");
        o.addProperty("prev_value", r.readBoolean());
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readMessageActionChangeCreator(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChangeCreator");
        o.addProperty("new_creator_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionNewCreatorPending(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionNewCreatorPending");
        o.addProperty("new_creator_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionStarGiftPurchaseOfferDeclined(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionStarGiftPurchaseOfferDeclined");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("expired", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.add("gift", r.readObject());
        o.add("price", r.readObject());
        return o;
    }

    private static JsonObject readMessageActionStarGiftPurchaseOffer(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionStarGiftPurchaseOffer");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("accepted", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("declined", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("gift", r.readObject());
        o.add("price", r.readObject());
        o.addProperty("expires_at", r.readInt());
        return o;
    }

    private static JsonObject readMessageActionSuggestBirthday(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSuggestBirthday");
        o.add("birthday", r.readObject());
        return o;
    }

    private static JsonObject readBirthday(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "birthday");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("day", r.readInt());
        o.addProperty("month", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("year", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageActionGiftTon(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGiftTon");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("currency", r.readString());
        o.addProperty("amount", r.readLong());
        o.addProperty("crypto_currency", r.readString());
        o.addProperty("crypto_amount", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("transaction_id", r.readString());
        }
        return o;
    }

    private static JsonObject readMessageActionSuggestedPostRefund(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSuggestedPostRefund");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("payer_initiated", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return o;
    }

    private static JsonObject readMessageActionSuggestedPostSuccess(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSuggestedPostSuccess");
        o.add("price", r.readObject());
        return o;
    }

    private static JsonObject readMessageActionSuggestedPostApproval(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSuggestedPostApproval");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("rejected", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("balance_too_low", TLObject.hasFlag(flags, TLObject.FLAG_1));
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("reject_comment", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("schedule_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("price", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessageActionTodoAppendTasks(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionTodoAppendTasks");
        o.add("list", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readMessageActionTodoCompletions(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionTodoCompletions");
        o.add("completed", r.readVector(TlBinaryReader::readInt));
        o.add("incompleted", r.readVector(TlBinaryReader::readInt));
        return o;
    }

    private static JsonObject readMessageActionConferenceCall(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionConferenceCall");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("missed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("active", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("video", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("call_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("duration", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("other_participants", r.readVector(TlBinaryReader::readObject));
        }
        return o;
    }

    private static JsonObject readMessageActionPaidMessagesPrice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPaidMessagesPrice");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("broadcast_messages_allowed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("stars", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionPaidMessagesRefunded(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPaidMessagesRefunded");
        o.addProperty("count", r.readInt());
        o.addProperty("stars", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionStarGiftUnique(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionStarGiftUnique");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("upgrade", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("transferred", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("saved", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("refunded", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("prepaid_upgrade", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("assigned", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("from_offer", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("craft", TLObject.hasFlag(flags, TLObject.FLAG_16));
        o.add("gift", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("can_export_at", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("transfer_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.add("peer", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("saved_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("resale_amount", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.addProperty("can_transfer_at", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("can_resell_at", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.addProperty("drop_original_details_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.addProperty("can_craft_at", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageActionStarGift(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionStarGift");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("name_hidden", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("saved", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("converted", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("upgraded", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("refunded", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("can_upgrade", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("prepaid_upgrade", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("upgrade_separate", TLObject.hasFlag(flags, TLObject.FLAG_16));
        o.addProperty("auction_acquired", TLObject.hasFlag(flags, TLObject.FLAG_17));
        o.add("gift", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("message", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("convert_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("upgrade_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("upgrade_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.add("from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.add("peer", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.addProperty("saved_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.addProperty("prepaid_upgrade_hash", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.addProperty("gift_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("to_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_19)) {
            o.addProperty("gift_num", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageActionPrizeStars(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPrizeStars");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("unclaimed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("stars", r.readLong());
        o.addProperty("transaction_id", r.readString());
        o.add("boost_peer", r.readObject());
        o.addProperty("giveaway_msg_id", r.readInt());
        return o;
    }

    private static JsonObject readMessageActionGiftStars(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGiftStars");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("currency", r.readString());
        o.addProperty("amount", r.readLong());
        o.addProperty("stars", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("crypto_currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("crypto_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("transaction_id", r.readString());
        }
        return o;
    }

    private static JsonObject readMessageActionPaymentRefunded(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPaymentRefunded");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("peer", r.readObject());
        o.addProperty("currency", r.readString());
        o.addProperty("total_amount", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("payload", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        }
        o.add("charge", r.readObject());
        return o;
    }

    private static JsonObject readPaymentCharge(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "paymentCharge");
        o.addProperty("id", r.readString());
        o.addProperty("provider_charge_id", r.readString());
        return o;
    }

    private static JsonObject readMessageActionRequestedPeerSentMe(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionRequestedPeerSentMe");
        o.addProperty("button_id", r.readInt());
        o.add("peers", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readRequestedPeerChannel(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "requestedPeerChannel");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("channel_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("username", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("photo", r.readObject());
        }
        return o;
    }

    private static JsonObject readRequestedPeerChat(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "requestedPeerChat");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("chat_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("photo", r.readObject());
        }
        return o;
    }

    private static JsonObject readRequestedPeerUser(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "requestedPeerUser");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("user_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("first_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("last_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("username", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("photo", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessageActionBoostApply(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionBoostApply");
        o.addProperty("boosts", r.readInt());
        return o;
    }

    private static JsonObject readMessageActionGiveawayResults(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGiveawayResults");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("stars", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("winners_count", r.readInt());
        o.addProperty("unclaimed_count", r.readInt());
        return o;
    }

    private static JsonObject readMessageActionGiveawayLaunch(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGiveawayLaunch");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("stars", r.readLong());
        }
        return o;
    }

    private static JsonObject readMessageActionGiftCode(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGiftCode");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("via_giveaway", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("unclaimed", TLObject.hasFlag(flags, TLObject.FLAG_5));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("boost_peer", r.readObject());
        }
        o.addProperty("days", r.readInt());
        o.addProperty("slug", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("crypto_currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("crypto_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("message", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessageActionSetChatWallPaper(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSetChatWallPaper");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("same", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("for_both", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.add("wallpaper", r.readObject());
        return o;
    }

    private static JsonObject readMessageActionRequestedPeer(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionRequestedPeer");
        o.addProperty("button_id", r.readInt());
        o.add("peers", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readMessageActionSuggestProfilePhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSuggestProfilePhoto");
        o.add("photo", r.readObject());
        return o;
    }

    private static JsonObject readMessageActionTopicEdit(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionTopicEdit");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("icon_emoji_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("closed", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("hidden", r.readBoolean());
        }
        return o;
    }

    private static JsonObject readMessageActionTopicCreate(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionTopicCreate");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("title_missing", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("title", r.readString());
        o.addProperty("icon_color", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("icon_emoji_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readMessageActionGiftPremium(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGiftPremium");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("currency", r.readString());
        o.addProperty("amount", r.readLong());
        o.addProperty("days", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("crypto_currency", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("crypto_amount", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("message", r.readObject());
        }
        return o;
    }

    private static JsonObject readMessageActionWebViewDataSent(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionWebViewDataSent");
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readMessageActionWebViewDataSentMe(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionWebViewDataSentMe");
        o.addProperty("text", r.readString());
        o.addProperty("data", r.readString());
        return o;
    }

    private static JsonObject readMessageActionChatJoinedByRequest(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatJoinedByRequest");
        return o;
    }

    private static JsonObject readMessageActionSetChatTheme(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSetChatTheme");
        o.add("theme", r.readObject());
        return o;
    }

    private static JsonObject readChatThemeUniqueGift(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatThemeUniqueGift");
        o.add("gift", r.readObject());
        o.add("theme_settings", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readChatTheme(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatTheme");
        o.addProperty("emoticon", r.readString());
        return o;
    }

    private static JsonObject readMessageActionGroupCallScheduled(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGroupCallScheduled");
        o.add("call", r.readObject());
        o.addProperty("schedule_date", r.readInt());
        return o;
    }

    private static JsonObject readMessageActionSetMessagesTTL(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSetMessagesTTL");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("period", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("auto_setting_from", r.readLong());
        }
        return o;
    }

    private static JsonObject readMessageActionInviteToGroupCall(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionInviteToGroupCall");
        o.add("call", r.readObject());
        o.add("users", r.readVector(TlBinaryReader::readLong));
        return o;
    }

    private static JsonObject readMessageActionGroupCall(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGroupCall");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("call", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("duration", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageActionGeoProximityReached(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGeoProximityReached");
        o.add("from_id", r.readObject());
        o.add("to_id", r.readObject());
        o.addProperty("distance", r.readInt());
        return o;
    }

    private static JsonObject readMessageActionContactSignUp(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionContactSignUp");
        return o;
    }

    private static JsonObject readMessageActionSecureValuesSent(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSecureValuesSent");
        o.add("types", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readSecureValueTypeEmail(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeEmail");
        return o;
    }

    private static JsonObject readSecureValueTypePhone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypePhone");
        return o;
    }

    private static JsonObject readSecureValueTypeTemporaryRegistration(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeTemporaryRegistration");
        return o;
    }

    private static JsonObject readSecureValueTypePassportRegistration(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypePassportRegistration");
        return o;
    }

    private static JsonObject readSecureValueTypeRentalAgreement(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeRentalAgreement");
        return o;
    }

    private static JsonObject readSecureValueTypeBankStatement(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeBankStatement");
        return o;
    }

    private static JsonObject readSecureValueTypeUtilityBill(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeUtilityBill");
        return o;
    }

    private static JsonObject readSecureValueTypeAddress(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeAddress");
        return o;
    }

    private static JsonObject readSecureValueTypeInternalPassport(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeInternalPassport");
        return o;
    }

    private static JsonObject readSecureValueTypeIdentityCard(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeIdentityCard");
        return o;
    }

    private static JsonObject readSecureValueTypeDriverLicense(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypeDriverLicense");
        return o;
    }

    private static JsonObject readSecureValueTypePassport(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypePassport");
        return o;
    }

    private static JsonObject readSecureValueTypePersonalDetails(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValueTypePersonalDetails");
        return o;
    }

    private static JsonObject readMessageActionSecureValuesSentMe(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionSecureValuesSentMe");
        o.add("values", r.readVector(TlBinaryReader::readObject));
        o.add("credentials", r.readObject());
        return o;
    }

    private static JsonObject readSecureCredentialsEncrypted(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureCredentialsEncrypted");
        o.addProperty("data", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        o.addProperty("hash", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        o.addProperty("secret", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readSecureValue(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureValue");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("type", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("data", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("front_side", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("reverse_side", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("selfie", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("translation", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("files", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("plain_data", r.readObject());
        }
        o.addProperty("hash", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readSecurePlainEmail(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "securePlainEmail");
        o.addProperty("email", r.readString());
        return o;
    }

    private static JsonObject readSecurePlainPhone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "securePlainPhone");
        o.addProperty("phone", r.readString());
        return o;
    }

    private static JsonObject readSecureFile(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureFile");
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("size", r.readLong());
        o.addProperty("dc_id", r.readInt());
        o.addProperty("date", r.readInt());
        o.addProperty("file_hash", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        o.addProperty("secret", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readSecureFileEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureFileEmpty");
        return o;
    }

    private static JsonObject readSecureData(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "secureData");
        o.addProperty("data", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        o.addProperty("data_hash", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        o.addProperty("secret", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readMessageActionBotAllowed(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionBotAllowed");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("attach_menu", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("from_request", TLObject.hasFlag(flags, TLObject.FLAG_3));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("domain", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("app", r.readObject());
        }
        return o;
    }

    private static JsonObject readBotApp(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botApp");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("short_name", r.readString());
        o.addProperty("title", r.readString());
        o.addProperty("description", r.readString());
        o.add("photo", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("document", r.readObject());
        }
        o.addProperty("hash", r.readLong());
        return o;
    }

    private static JsonObject readBotAppNotModified(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botAppNotModified");
        return o;
    }

    private static JsonObject readMessageActionCustomAction(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionCustomAction");
        o.addProperty("message", r.readString());
        return o;
    }

    private static JsonObject readMessageActionScreenshotTaken(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionScreenshotTaken");
        return o;
    }

    private static JsonObject readMessageActionPhoneCall(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPhoneCall");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("video", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("call_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("reason", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("duration", r.readInt());
        }
        return o;
    }

    private static JsonObject readPhoneCallDiscardReasonMigrateConferenceCall(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "phoneCallDiscardReasonMigrateConferenceCall");
        o.addProperty("slug", r.readString());
        return o;
    }

    private static JsonObject readPhoneCallDiscardReasonBusy(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "phoneCallDiscardReasonBusy");
        return o;
    }

    private static JsonObject readPhoneCallDiscardReasonHangup(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "phoneCallDiscardReasonHangup");
        return o;
    }

    private static JsonObject readPhoneCallDiscardReasonDisconnect(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "phoneCallDiscardReasonDisconnect");
        return o;
    }

    private static JsonObject readPhoneCallDiscardReasonMissed(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "phoneCallDiscardReasonMissed");
        return o;
    }

    private static JsonObject readMessageActionPaymentSent(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPaymentSent");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("recurring_init", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("recurring_used", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("currency", r.readString());
        o.addProperty("total_amount", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("invoice_slug", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("subscription_until_date", r.readInt());
        }
        return o;
    }

    private static JsonObject readMessageActionPaymentSentMe(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPaymentSentMe");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("recurring_init", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("recurring_used", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("currency", r.readString());
        o.addProperty("total_amount", r.readLong());
        o.addProperty("payload", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("info", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("shipping_option_id", r.readString());
        }
        o.add("charge", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("subscription_until_date", r.readInt());
        }
        return o;
    }

    private static JsonObject readPaymentRequestedInfo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "paymentRequestedInfo");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("phone", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("email", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("shipping_address", r.readObject());
        }
        return o;
    }

    private static JsonObject readPostAddress(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "postAddress");
        o.addProperty("street_line1", r.readString());
        o.addProperty("street_line2", r.readString());
        o.addProperty("city", r.readString());
        o.addProperty("state", r.readString());
        o.addProperty("country_iso2", r.readString());
        o.addProperty("post_code", r.readString());
        return o;
    }

    private static JsonObject readMessageActionGameScore(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionGameScore");
        o.addProperty("game_id", r.readLong());
        o.addProperty("score", r.readInt());
        return o;
    }

    private static JsonObject readMessageActionHistoryClear(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionHistoryClear");
        return o;
    }

    private static JsonObject readMessageActionPinMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionPinMessage");
        return o;
    }

    private static JsonObject readMessageActionChannelMigrateFrom(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChannelMigrateFrom");
        o.addProperty("title", r.readString());
        o.addProperty("chat_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionChatMigrateTo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatMigrateTo");
        o.addProperty("channel_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionChannelCreate(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChannelCreate");
        o.addProperty("title", r.readString());
        return o;
    }

    private static JsonObject readMessageActionChatJoinedByLink(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatJoinedByLink");
        o.addProperty("inviter_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionChatDeleteUser(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatDeleteUser");
        o.addProperty("user_id", r.readLong());
        return o;
    }

    private static JsonObject readMessageActionChatAddUser(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatAddUser");
        o.add("users", r.readVector(TlBinaryReader::readLong));
        return o;
    }

    private static JsonObject readMessageActionChatDeletePhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatDeletePhoto");
        return o;
    }

    private static JsonObject readMessageActionChatEditPhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatEditPhoto");
        o.add("photo", r.readObject());
        return o;
    }

    private static JsonObject readMessageActionChatEditTitle(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatEditTitle");
        o.addProperty("title", r.readString());
        return o;
    }

    private static JsonObject readMessageActionChatCreate(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionChatCreate");
        o.addProperty("title", r.readString());
        o.add("users", r.readVector(TlBinaryReader::readLong));
        return o;
    }

    private static JsonObject readMessageActionEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageActionEmpty");
        return o;
    }

    private static JsonObject readMessageReplyStoryHeader(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageReplyStoryHeader");
        o.add("peer", r.readObject());
        o.addProperty("story_id", r.readInt());
        return o;
    }

    private static JsonObject readMessageReplyHeader(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageReplyHeader");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("reply_to_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("forum_topic", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("quote", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("reply_to_ephemeral", TLObject.hasFlag(flags, TLObject.FLAG_13));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("reply_to_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("reply_to_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("reply_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("reply_media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("reply_to_top_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("quote_text", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.add("quote_entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("quote_offset", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("todo_item_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.addProperty("poll_option", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        }
        return o;
    }

    private static JsonObject readMessageFwdHeader(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageFwdHeader");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("imported", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("saved_out", TLObject.hasFlag(flags, TLObject.FLAG_11));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("from_name", r.readString());
        }
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("channel_post", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("post_author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("saved_from_peer", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("saved_from_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("saved_from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.addProperty("saved_from_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("saved_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("psa_type", r.readString());
        }
        return o;
    }

    private static JsonObject readMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "message");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("mentioned", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("media_unread", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("silent", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("post", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("from_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_18));
        o.addProperty("legacy", TLObject.hasFlag(flags, TLObject.FLAG_19));
        o.addProperty("edit_hide", TLObject.hasFlag(flags, TLObject.FLAG_21));
        o.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_24));
        o.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_26));
        o.addProperty("invert_media", TLObject.hasFlag(flags, TLObject.FLAG_27));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("offline", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        o.addProperty("video_processing_pending", TLObject.hasFlag(flags2, TLObject.FLAG_4));
        o.addProperty("paid_suggested_post_stars", TLObject.hasFlag(flags2, TLObject.FLAG_8));
        o.addProperty("paid_suggested_post_ton", TLObject.hasFlag(flags2, TLObject.FLAG_9));
        o.addProperty("id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_29)) {
            o.addProperty("from_boosts_applied", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            o.addProperty("from_rank", r.readString());
        }
        o.add("peer_id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            o.add("saved_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("fwd_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("via_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            o.addProperty("via_business_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_19)) {
            o.add("guestchat_via_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("reply_to", r.readObject());
        }
        o.addProperty("date", r.readInt());
        o.addProperty("message", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("reply_markup", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.add("entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("views", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("forwards", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_23)) {
            o.add("replies", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.addProperty("edit_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            o.addProperty("post_author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.addProperty("grouped_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            o.add("reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            o.add("restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            o.addProperty("ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            o.addProperty("quick_reply_shortcut_id", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_2)) {
            o.addProperty("effect", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_3)) {
            o.add("factcheck", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            o.addProperty("report_delivery_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            o.addProperty("paid_message_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            o.add("suggested_post", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            o.addProperty("schedule_repeat_period", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            o.addProperty("summary_from_language", r.readString());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_13)) {
            o.add("rich_message", r.readObject());
        }
        return o;
    }

    private static JsonObject readFactCheck(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "factCheck");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("need_check", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("country", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("text", r.readObject());
        }
        o.addProperty("hash", r.readLong());
        return o;
    }

    private static JsonObject readMessageReplies(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageReplies");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("comments", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("replies", r.readInt());
        o.addProperty("replies_pts", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("recent_repliers", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("channel_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("max_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("read_max_id", r.readInt());
        }
        return o;
    }

    private static JsonObject readReplyInlineMarkup(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "replyInlineMarkup");
        o.add("rows", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readKeyboardButtonRow(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonRow");
        o.add("buttons", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readKeyboardButtonCopy(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonCopy");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("copy_text", r.readString());
        return o;
    }

    private static JsonObject readKeyboardButtonStyle(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonStyle");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("bg_primary", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("bg_danger", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("bg_success", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("icon", r.readLong());
        }
        return o;
    }

    private static JsonObject readInputKeyboardButtonRequestPeer(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputKeyboardButtonRequestPeer");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("name_requested", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("username_requested", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("photo_requested", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("button_id", r.readInt());
        o.add("peer_type", r.readObject());
        o.addProperty("max_quantity", r.readInt());
        return o;
    }

    private static JsonObject readRequestPeerTypeCreateBot(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "requestPeerTypeCreateBot");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("bot_managed", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("suggested_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("suggested_username", r.readString());
        }
        return o;
    }

    private static JsonObject readRequestPeerTypeBroadcast(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "requestPeerTypeBroadcast");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("has_username", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("user_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("bot_admin_rights", r.readObject());
        }
        return o;
    }

    private static JsonObject readRequestPeerTypeChat(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "requestPeerTypeChat");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("bot_participant", TLObject.hasFlag(flags, TLObject.FLAG_5));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("has_username", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("forum", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("user_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("bot_admin_rights", r.readObject());
        }
        return o;
    }

    private static JsonObject readRequestPeerTypeUser(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "requestPeerTypeUser");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("bot", r.readBoolean());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("premium", r.readBoolean());
        }
        return o;
    }

    private static JsonObject readKeyboardButtonRequestPeer(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonRequestPeer");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("button_id", r.readInt());
        o.add("peer_type", r.readObject());
        o.addProperty("max_quantity", r.readInt());
        return o;
    }

    private static JsonObject readKeyboardButtonSimpleWebView(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonSimpleWebView");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("url", r.readString());
        return o;
    }

    private static JsonObject readKeyboardButtonWebView(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonWebView");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("url", r.readString());
        return o;
    }

    private static JsonObject readKeyboardButtonUserProfile(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonUserProfile");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("user_id", r.readLong());
        return o;
    }

    private static JsonObject readInputKeyboardButtonUserProfile(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputKeyboardButtonUserProfile");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.add("user_id", r.readObject());
        return o;
    }

    private static JsonObject readKeyboardButtonRequestPoll(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonRequestPoll");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("quiz", r.readBoolean());
        }
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readInputKeyboardButtonUrlAuth(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inputKeyboardButtonUrlAuth");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("request_write_access", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("fwd_text", r.readString());
        }
        o.addProperty("url", r.readString());
        o.add("bot", r.readObject());
        return o;
    }

    private static JsonObject readKeyboardButtonUrlAuth(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonUrlAuth");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("fwd_text", r.readString());
        }
        o.addProperty("url", r.readString());
        o.addProperty("button_id", r.readInt());
        return o;
    }

    private static JsonObject readKeyboardButtonBuy(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonBuy");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readKeyboardButtonGame(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonGame");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readKeyboardButtonSwitchInline(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonSwitchInline");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("same_peer", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("query", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.add("peer_types", r.readVector(TlBinaryReader::readObject));
        }
        return o;
    }

    private static JsonObject readInlineQueryPeerTypeBotPM(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inlineQueryPeerTypeBotPM");
        return o;
    }

    private static JsonObject readInlineQueryPeerTypeBroadcast(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inlineQueryPeerTypeBroadcast");
        return o;
    }

    private static JsonObject readInlineQueryPeerTypeMegagroup(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inlineQueryPeerTypeMegagroup");
        return o;
    }

    private static JsonObject readInlineQueryPeerTypeChat(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inlineQueryPeerTypeChat");
        return o;
    }

    private static JsonObject readInlineQueryPeerTypePM(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inlineQueryPeerTypePM");
        return o;
    }

    private static JsonObject readInlineQueryPeerTypeSameBotPM(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "inlineQueryPeerTypeSameBotPM");
        return o;
    }

    private static JsonObject readKeyboardButtonRequestGeoLocation(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonRequestGeoLocation");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readKeyboardButtonRequestPhone(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonRequestPhone");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readKeyboardButtonCallback(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonCallback");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("requires_password", TLObject.hasFlag(flags, TLObject.FLAG_0));
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("data", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        return o;
    }

    private static JsonObject readKeyboardButtonUrl(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButtonUrl");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        o.addProperty("url", r.readString());
        return o;
    }

    private static JsonObject readKeyboardButton(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "keyboardButton");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.add("style", r.readObject());
        }
        o.addProperty("text", r.readString());
        return o;
    }

    private static JsonObject readReplyKeyboardMarkup(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "replyKeyboardMarkup");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("resize", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("single_use", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("selective", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("persistent", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.add("rows", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("placeholder", r.readString());
        }
        return o;
    }

    private static JsonObject readReplyKeyboardForceReply(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "replyKeyboardForceReply");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("single_use", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("selective", TLObject.hasFlag(flags, TLObject.FLAG_2));
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("placeholder", r.readString());
        }
        return o;
    }

    private static JsonObject readReplyKeyboardHide(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "replyKeyboardHide");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("selective", TLObject.hasFlag(flags, TLObject.FLAG_2));
        return o;
    }

    private static JsonObject readMessageEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "messageEmpty");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("peer_id", r.readObject());
        }
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleNoForwards(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleNoForwards");
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantJoinByRequest(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantJoinByRequest");
        o.add("invite", r.readObject());
        o.addProperty("approved_by", r.readLong());
        return o;
    }

    private static JsonObject readChatInvitePublicJoinRequests(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatInvitePublicJoinRequests");
        return o;
    }

    private static JsonObject readChatInviteExported(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatInviteExported");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("revoked", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("permanent", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("request_needed", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("link", r.readString());
        o.addProperty("admin_id", r.readLong());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("start_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("expire_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("usage_limit", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("usage", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("requested", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("subscription_expired", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("subscription_pricing", r.readObject());
        }
        return o;
    }

    private static JsonObject readStarsSubscriptionPricing(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starsSubscriptionPricing");
        o.addProperty("period", r.readInt());
        o.addProperty("amount", r.readLong());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeHistoryTTL(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeHistoryTTL");
        o.addProperty("prev_value", r.readInt());
        o.addProperty("new_value", r.readInt());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantVolume(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantVolume");
        o.add("participant", r.readObject());
        return o;
    }

    private static JsonObject readGroupCallParticipant(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "groupCallParticipant");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("muted", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("can_self_unmute", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("just_joined", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("versioned", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("muted_by_you", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("volume_by_admin", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("self", TLObject.hasFlag(flags, TLObject.FLAG_12));
        o.addProperty("video_joined", TLObject.hasFlag(flags, TLObject.FLAG_15));
        o.add("peer", r.readObject());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("active_date", r.readInt());
        }
        o.addProperty("source", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("volume", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("about", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("raise_hand_rating", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("video", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.add("presentation", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            o.addProperty("paid_stars_total", r.readLong());
        }
        return o;
    }

    private static JsonObject readGroupCallParticipantVideo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "groupCallParticipantVideo");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("paused", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("endpoint", r.readString());
        o.add("source_groups", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("audio_source", r.readInt());
        }
        return o;
    }

    private static JsonObject readGroupCallParticipantVideoSourceGroup(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "groupCallParticipantVideoSourceGroup");
        o.addProperty("semantics", r.readString());
        o.add("sources", r.readVector(TlBinaryReader::readInt));
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionExportedInviteEdit(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionExportedInviteEdit");
        o.add("prev_invite", r.readObject());
        o.add("new_invite", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionExportedInviteRevoke(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionExportedInviteRevoke");
        o.add("invite", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionExportedInviteDelete(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionExportedInviteDelete");
        o.add("invite", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantJoinByInvite(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantJoinByInvite");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("via_chatlist", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.add("invite", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleGroupCallSetting(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleGroupCallSetting");
        o.addProperty("join_muted", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantUnmute(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantUnmute");
        o.add("participant", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantMute(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantMute");
        o.add("participant", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionDiscardGroupCall(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionDiscardGroupCall");
        o.add("call", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionStartGroupCall(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionStartGroupCall");
        o.add("call", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleSlowMode(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleSlowMode");
        o.addProperty("prev_value", r.readInt());
        o.addProperty("new_value", r.readInt());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeLocation(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeLocation");
        o.add("prev_value", r.readObject());
        o.add("new_value", r.readObject());
        return o;
    }

    private static JsonObject readChannelLocation(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelLocation");
        o.add("geo_point", r.readObject());
        o.addProperty("address", r.readString());
        return o;
    }

    private static JsonObject readChannelLocationEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelLocationEmpty");
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeLinkedChat(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeLinkedChat");
        o.addProperty("prev_value", r.readLong());
        o.addProperty("new_value", r.readLong());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionStopPoll(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionStopPoll");
        o.add("message", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionDefaultBannedRights(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionDefaultBannedRights");
        o.add("prev_banned_rights", r.readObject());
        o.add("new_banned_rights", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionTogglePreHistoryHidden(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionTogglePreHistoryHidden");
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeStickerSet(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeStickerSet");
        o.add("prev_stickerset", r.readObject());
        o.add("new_stickerset", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantToggleAdmin(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantToggleAdmin");
        o.add("prev_participant", r.readObject());
        o.add("new_participant", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantToggleBan(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantToggleBan");
        o.add("prev_participant", r.readObject());
        o.add("new_participant", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantInvite(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantInvite");
        o.add("participant", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantLeave(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantLeave");
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionParticipantJoin(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionParticipantJoin");
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionDeleteMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionDeleteMessage");
        o.add("message", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionEditMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionEditMessage");
        o.add("prev_message", r.readObject());
        o.add("new_message", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionUpdatePinned(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionUpdatePinned");
        o.add("message", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleSignatures(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleSignatures");
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionToggleInvites(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionToggleInvites");
        o.addProperty("new_value", r.readBoolean());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangePhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangePhoto");
        o.add("prev_photo", r.readObject());
        o.add("new_photo", r.readObject());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeUsername(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeUsername");
        o.addProperty("prev_value", r.readString());
        o.addProperty("new_value", r.readString());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeAbout(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeAbout");
        o.addProperty("prev_value", r.readString());
        o.addProperty("new_value", r.readString());
        return o;
    }

    private static JsonObject readChannelAdminLogEventActionChangeTitle(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelAdminLogEventActionChangeTitle");
        o.addProperty("prev_value", r.readString());
        o.addProperty("new_value", r.readString());
        return o;
    }

    private static JsonObject readUserFull(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userFull");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("blocked", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("phone_calls_available", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("phone_calls_private", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("can_pin_message", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("has_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_12));
        o.addProperty("video_calls_available", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("voice_messages_forbidden", TLObject.hasFlag(flags, TLObject.FLAG_20));
        o.addProperty("translations_disabled", TLObject.hasFlag(flags, TLObject.FLAG_23));
        o.addProperty("stories_pinned_available", TLObject.hasFlag(flags, TLObject.FLAG_26));
        o.addProperty("blocked_my_stories_from", TLObject.hasFlag(flags, TLObject.FLAG_27));
        o.addProperty("wallpaper_overridden", TLObject.hasFlag(flags, TLObject.FLAG_28));
        o.addProperty("contact_require_premium", TLObject.hasFlag(flags, TLObject.FLAG_29));
        o.addProperty("read_dates_private", TLObject.hasFlag(flags, TLObject.FLAG_30));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("sponsored_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_7));
        o.addProperty("can_view_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_9));
        o.addProperty("bot_can_manage_emoji_status", TLObject.hasFlag(flags2, TLObject.FLAG_10));
        o.addProperty("display_gifts_button", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        o.addProperty("noforwards_my_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_23));
        o.addProperty("noforwards_peer_enabled", TLObject.hasFlag(flags2, TLObject.FLAG_24));
        o.addProperty("unofficial_security_risk", TLObject.hasFlag(flags2, TLObject.FLAG_26));
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("about", r.readString());
        }
        o.add("settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_21)) {
            o.add("personal_photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("profile_photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            o.add("fallback_photo", r.readObject());
        }
        o.add("notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("bot_info", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("pinned_msg_id", r.readInt());
        }
        o.addProperty("common_chats_count", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("folder_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.addProperty("ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.add("theme", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            o.addProperty("private_forward_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.add("bot_group_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("bot_broadcast_admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_24)) {
            o.add("wallpaper", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            o.add("stories", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            o.add("business_work_hours", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_1)) {
            o.add("business_location", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_2)) {
            o.add("business_greeting_message", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_3)) {
            o.add("business_away_message", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            o.add("business_intro", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            o.add("birthday", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            o.addProperty("personal_channel_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            o.addProperty("personal_channel_message", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            o.addProperty("stargifts_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            o.add("starref_program", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            o.add("bot_verification", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            o.addProperty("send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_15)) {
            o.add("disallowed_gifts", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_17)) {
            o.add("stars_rating", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            o.add("stars_my_pending_rating", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            o.addProperty("stars_my_pending_rating_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_20)) {
            o.add("main_tab", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_21)) {
            o.add("saved_music", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_22)) {
            o.add("note", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_25)) {
            o.addProperty("bot_manager_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readProfileTabGifs(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "profileTabGifs");
        return o;
    }

    private static JsonObject readProfileTabLinks(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "profileTabLinks");
        return o;
    }

    private static JsonObject readProfileTabVoice(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "profileTabVoice");
        return o;
    }

    private static JsonObject readProfileTabMusic(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "profileTabMusic");
        return o;
    }

    private static JsonObject readProfileTabFiles(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "profileTabFiles");
        return o;
    }

    private static JsonObject readProfileTabMedia(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "profileTabMedia");
        return o;
    }

    private static JsonObject readProfileTabGifts(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "profileTabGifts");
        return o;
    }

    private static JsonObject readProfileTabPosts(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "profileTabPosts");
        return o;
    }

    private static JsonObject readStarsRating(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starsRating");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("level", r.readInt());
        o.addProperty("current_level_stars", r.readLong());
        o.addProperty("stars", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("next_level_stars", r.readLong());
        }
        return o;
    }

    private static JsonObject readDisallowedGiftsSettings(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "disallowedGiftsSettings");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("disallow_unlimited_stargifts", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("disallow_limited_stargifts", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("disallow_unique_stargifts", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("disallow_premium_gifts", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("disallow_stargifts_from_channels", TLObject.hasFlag(flags, TLObject.FLAG_4));
        return o;
    }

    private static JsonObject readBotVerification(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botVerification");
        o.addProperty("bot_id", r.readLong());
        o.addProperty("icon", r.readLong());
        o.addProperty("description", r.readString());
        return o;
    }

    private static JsonObject readStarRefProgram(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "starRefProgram");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("bot_id", r.readLong());
        o.addProperty("commission_permille", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("duration_months", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("end_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("daily_revenue_per_user", r.readObject());
        }
        return o;
    }

    private static JsonObject readBusinessIntro(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessIntro");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("title", r.readString());
        o.addProperty("description", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("sticker", r.readObject());
        }
        return o;
    }

    private static JsonObject readBusinessAwayMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessAwayMessage");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("offline_only", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("shortcut_id", r.readInt());
        o.add("schedule", r.readObject());
        o.add("recipients", r.readObject());
        return o;
    }

    private static JsonObject readBusinessRecipients(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessRecipients");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("existing_chats", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("new_chats", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("contacts", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("non_contacts", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("exclude_selected", TLObject.hasFlag(flags, TLObject.FLAG_5));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("users", r.readVector(TlBinaryReader::readLong));
        }
        return o;
    }

    private static JsonObject readBusinessAwayMessageScheduleCustom(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessAwayMessageScheduleCustom");
        o.addProperty("start_date", r.readInt());
        o.addProperty("end_date", r.readInt());
        return o;
    }

    private static JsonObject readBusinessAwayMessageScheduleOutsideWorkHours(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessAwayMessageScheduleOutsideWorkHours");
        return o;
    }

    private static JsonObject readBusinessAwayMessageScheduleAlways(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessAwayMessageScheduleAlways");
        return o;
    }

    private static JsonObject readBusinessGreetingMessage(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessGreetingMessage");
        o.addProperty("shortcut_id", r.readInt());
        o.add("recipients", r.readObject());
        o.addProperty("no_activity_days", r.readInt());
        return o;
    }

    private static JsonObject readBusinessLocation(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessLocation");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("geo_point", r.readObject());
        }
        o.addProperty("address", r.readString());
        return o;
    }

    private static JsonObject readBusinessWorkHours(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessWorkHours");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("open_now", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("timezone_id", r.readString());
        o.add("weekly_open", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readBusinessWeeklyOpen(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "businessWeeklyOpen");
        o.addProperty("start_minute", r.readInt());
        o.addProperty("end_minute", r.readInt());
        return o;
    }

    private static JsonObject readPeerStories(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "peerStories");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.add("peer", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("max_read_id", r.readInt());
        }
        o.add("stories", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readBotInfo(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botInfo");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("has_preview_medias", TLObject.hasFlag(flags, TLObject.FLAG_6));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("user_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("description", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("description_photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("description_document", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("commands", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("menu_button", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("privacy_policy_url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("app_settings", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("verifier_settings", r.readObject());
        }
        return o;
    }

    private static JsonObject readBotVerifierSettings(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botVerifierSettings");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("can_modify_custom_description", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("icon", r.readLong());
        o.addProperty("company", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("custom_description", r.readString());
        }
        return o;
    }

    private static JsonObject readBotAppSettings(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botAppSettings");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("placeholder_path", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("background_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("background_dark_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("header_color", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("header_dark_color", r.readInt());
        }
        return o;
    }

    private static JsonObject readBotMenuButton(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botMenuButton");
        o.addProperty("text", r.readString());
        o.addProperty("url", r.readString());
        return o;
    }

    private static JsonObject readBotMenuButtonCommands(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botMenuButtonCommands");
        return o;
    }

    private static JsonObject readBotMenuButtonDefault(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botMenuButtonDefault");
        return o;
    }

    private static JsonObject readBotCommand(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botCommand");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("ephemeral", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("command", r.readString());
        o.addProperty("description", r.readString());
        return o;
    }

    private static JsonObject readPeerSettings(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "peerSettings");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("report_spam", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("add_contact", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("block_contact", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("share_contact", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("need_contacts_exception", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("report_geo", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("autoarchived", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("invite_members", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("request_chat_broadcast", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("business_bot_paused", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("business_bot_can_reply", TLObject.hasFlag(flags, TLObject.FLAG_12));
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("geo_distance", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.addProperty("request_chat_title", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.addProperty("request_chat_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("business_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("business_bot_manage_url", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.addProperty("charge_paid_message_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.addProperty("registration_month", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            o.addProperty("phone_country", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.addProperty("name_change_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.addProperty("photo_change_date", r.readInt());
        }
        return o;
    }

    private static JsonObject readUser(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "user");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("self", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("contact", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("mutual_contact", TLObject.hasFlag(flags, TLObject.FLAG_12));
        o.addProperty("deleted", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("bot", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("bot_chat_history", TLObject.hasFlag(flags, TLObject.FLAG_15));
        o.addProperty("bot_nochats", TLObject.hasFlag(flags, TLObject.FLAG_16));
        o.addProperty("verified", TLObject.hasFlag(flags, TLObject.FLAG_17));
        o.addProperty("restricted", TLObject.hasFlag(flags, TLObject.FLAG_18));
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_20));
        o.addProperty("bot_inline_geo", TLObject.hasFlag(flags, TLObject.FLAG_21));
        o.addProperty("support", TLObject.hasFlag(flags, TLObject.FLAG_23));
        o.addProperty("scam", TLObject.hasFlag(flags, TLObject.FLAG_24));
        o.addProperty("apply_min_photo", TLObject.hasFlag(flags, TLObject.FLAG_25));
        o.addProperty("fake", TLObject.hasFlag(flags, TLObject.FLAG_26));
        o.addProperty("bot_attach_menu", TLObject.hasFlag(flags, TLObject.FLAG_27));
        o.addProperty("premium", TLObject.hasFlag(flags, TLObject.FLAG_28));
        o.addProperty("attach_menu_enabled", TLObject.hasFlag(flags, TLObject.FLAG_29));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("bot_can_edit", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        o.addProperty("close_friend", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        o.addProperty("stories_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        o.addProperty("stories_unavailable", TLObject.hasFlag(flags2, TLObject.FLAG_4));
        o.addProperty("contact_require_premium", TLObject.hasFlag(flags2, TLObject.FLAG_10));
        o.addProperty("bot_business", TLObject.hasFlag(flags2, TLObject.FLAG_11));
        o.addProperty("bot_has_main_app", TLObject.hasFlag(flags2, TLObject.FLAG_13));
        o.addProperty("bot_forum_view", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        o.addProperty("bot_forum_can_manage_topics", TLObject.hasFlag(flags2, TLObject.FLAG_17));
        o.addProperty("bot_can_manage_bots", TLObject.hasFlag(flags2, TLObject.FLAG_18));
        o.addProperty("bot_guestchat", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        o.addProperty("bot_guard", TLObject.hasFlag(flags2, TLObject.FLAG_20));
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("access_hash", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("first_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("last_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("username", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("phone", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("status", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.addProperty("bot_info_version", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_19)) {
            o.addProperty("bot_inline_placeholder", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            o.addProperty("lang_code", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            o.add("emoji_status", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            o.add("usernames", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            o.add("stories_max_id", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            o.add("color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            o.add("profile_color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            o.addProperty("bot_active_users", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            o.addProperty("bot_verification_icon", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_15)) {
            o.addProperty("send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_21)) {
            o.addProperty("linked_community_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readUserStatusLastMonth(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userStatusLastMonth");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("by_me", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return o;
    }

    private static JsonObject readUserStatusLastWeek(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userStatusLastWeek");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("by_me", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return o;
    }

    private static JsonObject readUserStatusRecently(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userStatusRecently");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("by_me", TLObject.hasFlag(flags, TLObject.FLAG_0));
        return o;
    }

    private static JsonObject readUserStatusOffline(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userStatusOffline");
        o.addProperty("was_online", r.readInt());
        return o;
    }

    private static JsonObject readUserStatusOnline(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userStatusOnline");
        o.addProperty("expires", r.readInt());
        return o;
    }

    private static JsonObject readUserStatusEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userStatusEmpty");
        return o;
    }

    private static JsonObject readUserProfilePhoto(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userProfilePhoto");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("has_video", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("personal", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("photo_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("stripped_thumb", Base64.encodeToString(r.readBytes(), Base64.NO_WRAP));
        }
        o.addProperty("dc_id", r.readInt());
        return o;
    }

    private static JsonObject readUserProfilePhotoEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userProfilePhotoEmpty");
        return o;
    }

    private static JsonObject readUserEmpty(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "userEmpty");
        o.addProperty("id", r.readLong());
        return o;
    }

    private static JsonObject readChatFull(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatFull");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("can_set_username", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("has_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("translations_disabled", TLObject.hasFlag(flags, TLObject.FLAG_19));
        o.addProperty("id", r.readLong());
        o.addProperty("about", r.readString());
        o.add("participants", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("chat_photo", r.readObject());
        }
        o.add("notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.add("exported_invite", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("bot_info", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("pinned_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("folder_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.add("call", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.addProperty("ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.add("groupcall_default_join_as", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            o.addProperty("theme_emoticon", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.addProperty("requests_pending", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.add("recent_requesters", r.readVector(TlBinaryReader::readLong));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("available_reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            o.addProperty("reactions_limit", r.readInt());
        }
        return o;
    }

    private static JsonObject readChatParticipants(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatParticipants");
        o.addProperty("chat_id", r.readLong());
        o.add("participants", r.readVector(TlBinaryReader::readObject));
        o.addProperty("version", r.readInt());
        return o;
    }

    private static JsonObject readChatParticipantAdmin(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatParticipantAdmin");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("user_id", r.readLong());
        o.addProperty("inviter_id", r.readLong());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("rank", r.readString());
        }
        return o;
    }

    private static JsonObject readChatParticipantCreator(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatParticipantCreator");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("user_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("rank", r.readString());
        }
        return o;
    }

    private static JsonObject readChatParticipant(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatParticipant");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("user_id", r.readLong());
        o.addProperty("inviter_id", r.readLong());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("rank", r.readString());
        }
        return o;
    }

    private static JsonObject readChatParticipantsForbidden(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "chatParticipantsForbidden");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("chat_id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.add("self_participant", r.readObject());
        }
        return o;
    }

    private static JsonObject readChannelFull(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channelFull");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("can_view_participants", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("can_set_username", TLObject.hasFlag(flags, TLObject.FLAG_6));
        o.addProperty("can_set_stickers", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("hidden_prehistory", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("can_set_location", TLObject.hasFlag(flags, TLObject.FLAG_16));
        o.addProperty("has_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_19));
        o.addProperty("can_view_stats", TLObject.hasFlag(flags, TLObject.FLAG_20));
        o.addProperty("blocked", TLObject.hasFlag(flags, TLObject.FLAG_22));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("can_delete_channel", TLObject.hasFlag(flags2, TLObject.FLAG_0));
        o.addProperty("antispam", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        o.addProperty("participants_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        o.addProperty("translations_disabled", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        o.addProperty("stories_pinned_available", TLObject.hasFlag(flags2, TLObject.FLAG_5));
        o.addProperty("view_forum_as_messages", TLObject.hasFlag(flags2, TLObject.FLAG_6));
        o.addProperty("restricted_sponsored", TLObject.hasFlag(flags2, TLObject.FLAG_11));
        o.addProperty("can_view_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_12));
        o.addProperty("paid_media_allowed", TLObject.hasFlag(flags2, TLObject.FLAG_14));
        o.addProperty("can_view_stars_revenue", TLObject.hasFlag(flags2, TLObject.FLAG_15));
        o.addProperty("paid_reactions_available", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        o.addProperty("stargifts_available", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        o.addProperty("paid_messages_available", TLObject.hasFlag(flags2, TLObject.FLAG_20));
        o.addProperty("id", r.readLong());
        o.addProperty("about", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("participants_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("admins_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("kicked_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("banned_count", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("online_count", r.readInt());
        }
        o.addProperty("read_inbox_max_id", r.readInt());
        o.addProperty("read_outbox_max_id", r.readInt());
        o.addProperty("unread_count", r.readInt());
        o.add("chat_photo", r.readObject());
        o.add("notify_settings", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_23)) {
            o.add("exported_invite", r.readObject());
        }
        o.add("bot_info", r.readVector(TlBinaryReader::readObject));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("migrated_from_chat_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("migrated_from_max_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.addProperty("pinned_msg_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("stickerset", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.addProperty("available_min_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("folder_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.addProperty("linked_chat_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.add("location", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.addProperty("slowmode_seconds", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.addProperty("slowmode_next_send_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_12)) {
            o.addProperty("stats_dc", r.readInt());
        }
        o.addProperty("pts", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_21)) {
            o.add("call", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_24)) {
            o.addProperty("ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            o.add("pending_suggestions", r.readVector(TlBinaryReader::readString));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_26)) {
            o.add("groupcall_default_join_as", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_27)) {
            o.addProperty("theme_emoticon", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            o.addProperty("requests_pending", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            o.add("recent_requesters", r.readVector(TlBinaryReader::readLong));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_29)) {
            o.add("default_send_as", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            o.add("available_reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_13)) {
            o.addProperty("reactions_limit", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            o.add("stories", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            o.add("wallpaper", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            o.addProperty("boosts_applied", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            o.addProperty("boosts_unrestrict", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            o.add("emojiset", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_17)) {
            o.add("bot_verification", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            o.addProperty("stargifts_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_21)) {
            o.addProperty("send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_22)) {
            o.add("main_tab", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_23)) {
            o.addProperty("guard_bot_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readStickerSet(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "stickerSet");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("archived", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("official", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("masks", TLObject.hasFlag(flags, TLObject.FLAG_3));
        o.addProperty("emojis", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("text_color", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("channel_emoji_status", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_11));
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("installed_date", r.readInt());
        }
        o.addProperty("id", r.readLong());
        o.addProperty("access_hash", r.readLong());
        o.addProperty("title", r.readString());
        o.addProperty("short_name", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("thumbs", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("thumb_dc_id", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("thumb_version", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.addProperty("thumb_document_id", r.readLong());
        }
        o.addProperty("count", r.readInt());
        o.addProperty("hash", r.readInt());
        return o;
    }

    private static JsonObject readDraftMessageLayer226(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "draftMessage");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("no_webpage", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("invert_media", TLObject.hasFlag(flags, TLObject.FLAG_6));
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.add("reply_to", r.readObject());
        }
        o.addProperty("message", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("media", r.readObject());
        }
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.addProperty("effect", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("suggested_post", r.readObject());
        }
        return o;
    }

    private static JsonObject readPageBlockOrderedListLayer226(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageBlockOrderedList");
        o.add("items", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPageListOrderedItemBlocksLayer226(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageListOrderedItemBlocks");
        o.addProperty("num", r.readString());
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readChannelLayer227(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "channel");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("creator", TLObject.hasFlag(flags, TLObject.FLAG_0));
        o.addProperty("left", TLObject.hasFlag(flags, TLObject.FLAG_2));
        o.addProperty("broadcast", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("verified", TLObject.hasFlag(flags, TLObject.FLAG_7));
        o.addProperty("megagroup", TLObject.hasFlag(flags, TLObject.FLAG_8));
        o.addProperty("restricted", TLObject.hasFlag(flags, TLObject.FLAG_9));
        o.addProperty("signatures", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_12));
        o.addProperty("scam", TLObject.hasFlag(flags, TLObject.FLAG_19));
        o.addProperty("has_link", TLObject.hasFlag(flags, TLObject.FLAG_20));
        o.addProperty("has_geo", TLObject.hasFlag(flags, TLObject.FLAG_21));
        o.addProperty("slowmode_enabled", TLObject.hasFlag(flags, TLObject.FLAG_22));
        o.addProperty("call_active", TLObject.hasFlag(flags, TLObject.FLAG_23));
        o.addProperty("call_not_empty", TLObject.hasFlag(flags, TLObject.FLAG_24));
        o.addProperty("fake", TLObject.hasFlag(flags, TLObject.FLAG_25));
        o.addProperty("gigagroup", TLObject.hasFlag(flags, TLObject.FLAG_26));
        o.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_27));
        o.addProperty("join_to_send", TLObject.hasFlag(flags, TLObject.FLAG_28));
        o.addProperty("join_request", TLObject.hasFlag(flags, TLObject.FLAG_29));
        o.addProperty("forum", TLObject.hasFlag(flags, TLObject.FLAG_30));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("stories_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        o.addProperty("stories_hidden_min", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        o.addProperty("stories_unavailable", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        o.addProperty("signature_profiles", TLObject.hasFlag(flags2, TLObject.FLAG_12));
        o.addProperty("autotranslation", TLObject.hasFlag(flags2, TLObject.FLAG_15));
        o.addProperty("broadcast_messages_allowed", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        o.addProperty("monoforum", TLObject.hasFlag(flags2, TLObject.FLAG_17));
        o.addProperty("forum_tabs", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_13)) {
            o.addProperty("access_hash", r.readLong());
        }
        o.addProperty("title", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.addProperty("username", r.readString());
        }
        o.add("photo", r.readObject());
        o.addProperty("date", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.add("admin_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.add("banned_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("default_banned_rights", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.addProperty("participants_count", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            o.add("usernames", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_4)) {
            o.add("stories_max_id", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            o.add("color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            o.add("profile_color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            o.add("emoji_status", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            o.addProperty("level", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            o.addProperty("subscription_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_13)) {
            o.addProperty("bot_verification_icon", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            o.addProperty("send_paid_messages_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_18)) {
            o.addProperty("linked_monoforum_id", r.readLong());
        }
        return o;
    }

    private static JsonObject readPageListItemBlocksLayer226(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageListItemBlocks");
        o.add("blocks", r.readVector(TlBinaryReader::readObject));
        return o;
    }

    private static JsonObject readPageListItemTextLayer226(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageListItemText");
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readPageListOrderedItemTextLayer226(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "pageListOrderedItemText");
        o.addProperty("num", r.readString());
        o.add("text", r.readObject());
        return o;
    }

    private static JsonObject readMessageLayer226(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "message");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("out", TLObject.hasFlag(flags, TLObject.FLAG_1));
        o.addProperty("mentioned", TLObject.hasFlag(flags, TLObject.FLAG_4));
        o.addProperty("media_unread", TLObject.hasFlag(flags, TLObject.FLAG_5));
        o.addProperty("silent", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("post", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("from_scheduled", TLObject.hasFlag(flags, TLObject.FLAG_18));
        o.addProperty("legacy", TLObject.hasFlag(flags, TLObject.FLAG_19));
        o.addProperty("edit_hide", TLObject.hasFlag(flags, TLObject.FLAG_21));
        o.addProperty("pinned", TLObject.hasFlag(flags, TLObject.FLAG_24));
        o.addProperty("noforwards", TLObject.hasFlag(flags, TLObject.FLAG_26));
        o.addProperty("invert_media", TLObject.hasFlag(flags, TLObject.FLAG_27));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("offline", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        o.addProperty("video_processing_pending", TLObject.hasFlag(flags2, TLObject.FLAG_4));
        o.addProperty("paid_suggested_post_stars", TLObject.hasFlag(flags2, TLObject.FLAG_8));
        o.addProperty("paid_suggested_post_ton", TLObject.hasFlag(flags2, TLObject.FLAG_9));
        o.addProperty("id", r.readInt());
        if (TLObject.hasFlag(flags, TLObject.FLAG_8)) {
            o.add("from_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_29)) {
            o.addProperty("from_boosts_applied", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            o.addProperty("from_rank", r.readString());
        }
        o.add("peer_id", r.readObject());
        if (TLObject.hasFlag(flags, TLObject.FLAG_28)) {
            o.add("saved_peer_id", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.add("fwd_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_11)) {
            o.addProperty("via_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            o.addProperty("via_business_bot_id", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_19)) {
            o.add("guestchat_via_from", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.add("reply_to", r.readObject());
        }
        o.addProperty("date", r.readInt());
        o.addProperty("message", r.readString());
        if (TLObject.hasFlag(flags, TLObject.FLAG_9)) {
            o.add("media", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("reply_markup", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_7)) {
            o.add("entities", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("views", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_10)) {
            o.addProperty("forwards", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_23)) {
            o.add("replies", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_15)) {
            o.addProperty("edit_date", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_16)) {
            o.addProperty("post_author", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_17)) {
            o.addProperty("grouped_id", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_20)) {
            o.add("reactions", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            o.add("restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_25)) {
            o.addProperty("ttl_period", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            o.addProperty("quick_reply_shortcut_id", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_2)) {
            o.addProperty("effect", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_3)) {
            o.add("factcheck", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            o.addProperty("report_delivery_until_date", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_6)) {
            o.addProperty("paid_message_stars", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_7)) {
            o.add("suggested_post", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_10)) {
            o.addProperty("schedule_repeat_period", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_11)) {
            o.addProperty("summary_from_language", r.readString());
        }
        return o;
    }

    private static JsonObject readBotCommandLayer227(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "botCommand");
        o.addProperty("command", r.readString());
        o.addProperty("description", r.readString());
        return o;
    }

    private static JsonObject readUserLayer227(TlBinaryReader r) {
        var o = new JsonObject();
        o.addProperty("_", "user");
        var flags = r.readInt();
        o.addProperty("flags", flags);
        o.addProperty("self", TLObject.hasFlag(flags, TLObject.FLAG_10));
        o.addProperty("contact", TLObject.hasFlag(flags, TLObject.FLAG_11));
        o.addProperty("mutual_contact", TLObject.hasFlag(flags, TLObject.FLAG_12));
        o.addProperty("deleted", TLObject.hasFlag(flags, TLObject.FLAG_13));
        o.addProperty("bot", TLObject.hasFlag(flags, TLObject.FLAG_14));
        o.addProperty("bot_chat_history", TLObject.hasFlag(flags, TLObject.FLAG_15));
        o.addProperty("bot_nochats", TLObject.hasFlag(flags, TLObject.FLAG_16));
        o.addProperty("verified", TLObject.hasFlag(flags, TLObject.FLAG_17));
        o.addProperty("restricted", TLObject.hasFlag(flags, TLObject.FLAG_18));
        o.addProperty("min", TLObject.hasFlag(flags, TLObject.FLAG_20));
        o.addProperty("bot_inline_geo", TLObject.hasFlag(flags, TLObject.FLAG_21));
        o.addProperty("support", TLObject.hasFlag(flags, TLObject.FLAG_23));
        o.addProperty("scam", TLObject.hasFlag(flags, TLObject.FLAG_24));
        o.addProperty("apply_min_photo", TLObject.hasFlag(flags, TLObject.FLAG_25));
        o.addProperty("fake", TLObject.hasFlag(flags, TLObject.FLAG_26));
        o.addProperty("bot_attach_menu", TLObject.hasFlag(flags, TLObject.FLAG_27));
        o.addProperty("premium", TLObject.hasFlag(flags, TLObject.FLAG_28));
        o.addProperty("attach_menu_enabled", TLObject.hasFlag(flags, TLObject.FLAG_29));
        var flags2 = r.readInt();
        o.addProperty("flags2", flags2);
        o.addProperty("bot_can_edit", TLObject.hasFlag(flags2, TLObject.FLAG_1));
        o.addProperty("close_friend", TLObject.hasFlag(flags2, TLObject.FLAG_2));
        o.addProperty("stories_hidden", TLObject.hasFlag(flags2, TLObject.FLAG_3));
        o.addProperty("stories_unavailable", TLObject.hasFlag(flags2, TLObject.FLAG_4));
        o.addProperty("contact_require_premium", TLObject.hasFlag(flags2, TLObject.FLAG_10));
        o.addProperty("bot_business", TLObject.hasFlag(flags2, TLObject.FLAG_11));
        o.addProperty("bot_has_main_app", TLObject.hasFlag(flags2, TLObject.FLAG_13));
        o.addProperty("bot_forum_view", TLObject.hasFlag(flags2, TLObject.FLAG_16));
        o.addProperty("bot_forum_can_manage_topics", TLObject.hasFlag(flags2, TLObject.FLAG_17));
        o.addProperty("bot_can_manage_bots", TLObject.hasFlag(flags2, TLObject.FLAG_18));
        o.addProperty("bot_guestchat", TLObject.hasFlag(flags2, TLObject.FLAG_19));
        o.addProperty("bot_guard", TLObject.hasFlag(flags2, TLObject.FLAG_20));
        o.addProperty("id", r.readLong());
        if (TLObject.hasFlag(flags, TLObject.FLAG_0)) {
            o.addProperty("access_hash", r.readLong());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_1)) {
            o.addProperty("first_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_2)) {
            o.addProperty("last_name", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_3)) {
            o.addProperty("username", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_4)) {
            o.addProperty("phone", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_5)) {
            o.add("photo", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_6)) {
            o.add("status", r.readObject());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_14)) {
            o.addProperty("bot_info_version", r.readInt());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_18)) {
            o.add("restriction_reason", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_19)) {
            o.addProperty("bot_inline_placeholder", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_22)) {
            o.addProperty("lang_code", r.readString());
        }
        if (TLObject.hasFlag(flags, TLObject.FLAG_30)) {
            o.add("emoji_status", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_0)) {
            o.add("usernames", r.readVector(TlBinaryReader::readObject));
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_5)) {
            o.add("stories_max_id", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_8)) {
            o.add("color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_9)) {
            o.add("profile_color", r.readObject());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_12)) {
            o.addProperty("bot_active_users", r.readInt());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_14)) {
            o.addProperty("bot_verification_icon", r.readLong());
        }
        if (TLObject.hasFlag(flags2, TLObject.FLAG_15)) {
            o.addProperty("send_paid_messages_stars", r.readLong());
        }
        return o;
    }
}
// LAYER 228
