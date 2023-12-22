package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(Symbol.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.Symbol;i4)")
@WinRTByReference(brClass = Symbol.ByReference::class)
public enum class Symbol(
  public val value: Int
) : NativeMapped {
  Previous(57600),
  Next(57601),
  Play(57602),
  Pause(57603),
  Edit(57604),
  Save(57605),
  Clear(57606),
  Delete(57607),
  Remove(57608),
  Add(57609),
  Cancel(57610),
  Accept(57611),
  More(57612),
  Redo(57613),
  Undo(57614),
  Home(57615),
  Up(57616),
  Forward(57617),
  Back(57618),
  Favorite(57619),
  Camera(57620),
  Setting(57621),
  Video(57622),
  Sync(57623),
  Download(57624),
  Mail(57625),
  Find(57626),
  Help(57627),
  Upload(57628),
  Emoji(57629),
  TwoPage(57630),
  LeaveChat(57631),
  MailForward(57632),
  Clock(57633),
  Send(57634),
  Crop(57635),
  RotateCamera(57636),
  People(57637),
  OpenPane(57638),
  ClosePane(57639),
  World(57640),
  Flag(57641),
  PreviewLink(57642),
  Globe(57643),
  Trim(57644),
  AttachCamera(57645),
  ZoomIn(57646),
  Bookmarks(57647),
  Document(57648),
  ProtectedDocument(57649),
  Page(57650),
  Bullets(57651),
  Comment(57652),
  MailFilled(57653),
  ContactInfo(57654),
  HangUp(57655),
  ViewAll(57656),
  MapPin(57657),
  Phone(57658),
  VideoChat(57659),
  Switch(57660),
  Contact(57661),
  Rename(57662),
  Pin(57665),
  MusicInfo(57666),
  Go(57667),
  Keyboard(57668),
  DockLeft(57669),
  DockRight(57670),
  DockBottom(57671),
  Remote(57672),
  Refresh(57673),
  Rotate(57674),
  Shuffle(57675),
  List(57676),
  Shop(57677),
  SelectAll(57678),
  Orientation(57679),
  Import(57680),
  ImportAll(57681),
  BrowsePhotos(57685),
  WebCam(57686),
  Pictures(57688),
  SaveLocal(57689),
  Caption(57690),
  Stop(57691),
  ShowResults(57692),
  Volume(57693),
  Repair(57694),
  Message(57695),
  Page2(57696),
  CalendarDay(57697),
  CalendarWeek(57698),
  Calendar(57699),
  Character(57700),
  MailReplyAll(57701),
  Read(57702),
  Link(57703),
  Account(57704),
  ShowBcc(57705),
  HideBcc(57706),
  Cut(57707),
  Attach(57708),
  Paste(57709),
  Filter(57710),
  Copy(57711),
  Emoji2(57712),
  Important(57713),
  MailReply(57714),
  SlideShow(57715),
  Sort(57716),
  Manage(57720),
  AllApps(57721),
  DisconnectDrive(57722),
  MapDrive(57723),
  NewWindow(57724),
  OpenWith(57725),
  ContactPresence(57729),
  Priority(57730),
  GoToToday(57732),
  Font(57733),
  FontColor(57734),
  Contact2(57735),
  Folder(57736),
  Audio(57737),
  Placeholder(57738),
  View(57739),
  SetLockScreen(57740),
  SetTile(57741),
  ClosedCaption(57744),
  StopSlideShow(57745),
  Permissions(57746),
  Highlight(57747),
  DisableUpdates(57748),
  UnFavorite(57749),
  UnPin(57750),
  OpenLocal(57751),
  Mute(57752),
  Italic(57753),
  Underline(57754),
  Bold(57755),
  MoveToFolder(57756),
  LikeDislike(57757),
  Dislike(57758),
  Like(57759),
  AlignRight(57760),
  AlignCenter(57761),
  AlignLeft(57762),
  Zoom(57763),
  ZoomOut(57764),
  OpenFile(57765),
  OtherUser(57766),
  Admin(57767),
  Street(57795),
  Map(57796),
  ClearSelection(57797),
  FontDecrease(57798),
  FontIncrease(57799),
  FontSize(57800),
  CellPhone(57801),
  ReShare(57802),
  Tag(57803),
  RepeatOne(57804),
  RepeatAll(57805),
  OutlineStar(57806),
  SolidStar(57807),
  Calculator(57808),
  Directions(57809),
  Target(57810),
  Library(57811),
  PhoneBook(57812),
  Memo(57813),
  Microphone(57814),
  PostUpdate(57815),
  BackToWindow(57816),
  FullScreen(57817),
  NewFolder(57818),
  CalendarReply(57819),
  UnSyncFolder(57821),
  ReportHacked(57822),
  SyncFolder(57823),
  BlockContact(57824),
  SwitchApps(57825),
  AddFriend(57826),
  TouchPointer(57827),
  GoToStart(57828),
  ZeroBars(57829),
  OneBar(57830),
  TwoBars(57831),
  ThreeBars(57832),
  FourBars(57833),
  Scan(58004),
  Preview(58005),
  GlobalNavigationButton(59136),
  Share(59181),
  Print(59209),
  XboxOneConsole(59792),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): Symbol {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      57600 -> Previous
      57601 -> Next
      57602 -> Play
      57603 -> Pause
      57604 -> Edit
      57605 -> Save
      57606 -> Clear
      57607 -> Delete
      57608 -> Remove
      57609 -> Add
      57610 -> Cancel
      57611 -> Accept
      57612 -> More
      57613 -> Redo
      57614 -> Undo
      57615 -> Home
      57616 -> Up
      57617 -> Forward
      57618 -> Back
      57619 -> Favorite
      57620 -> Camera
      57621 -> Setting
      57622 -> Video
      57623 -> Sync
      57624 -> Download
      57625 -> Mail
      57626 -> Find
      57627 -> Help
      57628 -> Upload
      57629 -> Emoji
      57630 -> TwoPage
      57631 -> LeaveChat
      57632 -> MailForward
      57633 -> Clock
      57634 -> Send
      57635 -> Crop
      57636 -> RotateCamera
      57637 -> People
      57638 -> OpenPane
      57639 -> ClosePane
      57640 -> World
      57641 -> Flag
      57642 -> PreviewLink
      57643 -> Globe
      57644 -> Trim
      57645 -> AttachCamera
      57646 -> ZoomIn
      57647 -> Bookmarks
      57648 -> Document
      57649 -> ProtectedDocument
      57650 -> Page
      57651 -> Bullets
      57652 -> Comment
      57653 -> MailFilled
      57654 -> ContactInfo
      57655 -> HangUp
      57656 -> ViewAll
      57657 -> MapPin
      57658 -> Phone
      57659 -> VideoChat
      57660 -> Switch
      57661 -> Contact
      57662 -> Rename
      57665 -> Pin
      57666 -> MusicInfo
      57667 -> Go
      57668 -> Keyboard
      57669 -> DockLeft
      57670 -> DockRight
      57671 -> DockBottom
      57672 -> Remote
      57673 -> Refresh
      57674 -> Rotate
      57675 -> Shuffle
      57676 -> List
      57677 -> Shop
      57678 -> SelectAll
      57679 -> Orientation
      57680 -> Import
      57681 -> ImportAll
      57685 -> BrowsePhotos
      57686 -> WebCam
      57688 -> Pictures
      57689 -> SaveLocal
      57690 -> Caption
      57691 -> Stop
      57692 -> ShowResults
      57693 -> Volume
      57694 -> Repair
      57695 -> Message
      57696 -> Page2
      57697 -> CalendarDay
      57698 -> CalendarWeek
      57699 -> Calendar
      57700 -> Character
      57701 -> MailReplyAll
      57702 -> Read
      57703 -> Link
      57704 -> Account
      57705 -> ShowBcc
      57706 -> HideBcc
      57707 -> Cut
      57708 -> Attach
      57709 -> Paste
      57710 -> Filter
      57711 -> Copy
      57712 -> Emoji2
      57713 -> Important
      57714 -> MailReply
      57715 -> SlideShow
      57716 -> Sort
      57720 -> Manage
      57721 -> AllApps
      57722 -> DisconnectDrive
      57723 -> MapDrive
      57724 -> NewWindow
      57725 -> OpenWith
      57729 -> ContactPresence
      57730 -> Priority
      57732 -> GoToToday
      57733 -> Font
      57734 -> FontColor
      57735 -> Contact2
      57736 -> Folder
      57737 -> Audio
      57738 -> Placeholder
      57739 -> View
      57740 -> SetLockScreen
      57741 -> SetTile
      57744 -> ClosedCaption
      57745 -> StopSlideShow
      57746 -> Permissions
      57747 -> Highlight
      57748 -> DisableUpdates
      57749 -> UnFavorite
      57750 -> UnPin
      57751 -> OpenLocal
      57752 -> Mute
      57753 -> Italic
      57754 -> Underline
      57755 -> Bold
      57756 -> MoveToFolder
      57757 -> LikeDislike
      57758 -> Dislike
      57759 -> Like
      57760 -> AlignRight
      57761 -> AlignCenter
      57762 -> AlignLeft
      57763 -> Zoom
      57764 -> ZoomOut
      57765 -> OpenFile
      57766 -> OtherUser
      57767 -> Admin
      57795 -> Street
      57796 -> Map
      57797 -> ClearSelection
      57798 -> FontDecrease
      57799 -> FontIncrease
      57800 -> FontSize
      57801 -> CellPhone
      57802 -> ReShare
      57803 -> Tag
      57804 -> RepeatOne
      57805 -> RepeatAll
      57806 -> OutlineStar
      57807 -> SolidStar
      57808 -> Calculator
      57809 -> Directions
      57810 -> Target
      57811 -> Library
      57812 -> PhoneBook
      57813 -> Memo
      57814 -> Microphone
      57815 -> PostUpdate
      57816 -> BackToWindow
      57817 -> FullScreen
      57818 -> NewFolder
      57819 -> CalendarReply
      57821 -> UnSyncFolder
      57822 -> ReportHacked
      57823 -> SyncFolder
      57824 -> BlockContact
      57825 -> SwitchApps
      57826 -> AddFriend
      57827 -> TouchPointer
      57828 -> GoToStart
      57829 -> ZeroBars
      57830 -> OneBar
      57831 -> TwoBars
      57832 -> ThreeBars
      57833 -> FourBars
      58004 -> Scan
      58005 -> Preview
      59136 -> GlobalNavigationButton
      59181 -> Share
      59209 -> Print
      59792 -> XboxOneConsole
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Symbol> {
    public fun setValue(newValue: Symbol): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Symbol = Symbol.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<Symbol, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Symbol = Symbol.values()[0].fromNative(value, null)

    public override fun toNative(obj: Symbol): Int = obj.value
  }
}
