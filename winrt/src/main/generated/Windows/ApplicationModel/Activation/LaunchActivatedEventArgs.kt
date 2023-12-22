package Windows.ApplicationModel.Activation

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LaunchActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.LaunchActivatedEventArgs;{fbc93e26-a14a-4b4f-82b0-33bed920af52})")
@WinRTByReference(brClass = LaunchActivatedEventArgs.ByReference::class)
public class LaunchActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILaunchActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IApplicationViewActivatedEventArgs.WithDefault, IPrelaunchActivatedEventArgs.WithDefault,
    IViewSwitcherProvider.WithDefault, ILaunchActivatedEventArgs2.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __183308062_Interface: ILaunchActivatedEventArgs.WithDefault by lazy {
    as_183308062()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __1142708526_Interface: IApplicationViewActivatedEventArgs.WithDefault by lazy {
    as_1142708526()
  }


  private val __1820939821_Interface: IPrelaunchActivatedEventArgs.WithDefault by lazy {
    as_1820939821()
  }


  private val __1905429824_Interface: IViewSwitcherProvider.WithDefault by lazy {
    as_1905429824()
  }


  private val __1387582576_Interface: ILaunchActivatedEventArgs2.WithDefault by lazy {
    as_1387582576()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __183308062_Ptr: JNAPointer? by lazy {
    __183308062_Interface.__183308062_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __1142708526_Ptr: JNAPointer? by lazy {
    __1142708526_Interface.__1142708526_Ptr
  }


  public override val __1820939821_Ptr: JNAPointer? by lazy {
    __1820939821_Interface.__1820939821_Ptr
  }


  public override val __1905429824_Ptr: JNAPointer? by lazy {
    __1905429824_Interface.__1905429824_Ptr
  }


  public override val __1387582576_Ptr: JNAPointer? by lazy {
    __1387582576_Interface.__1387582576_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__183308062_Interface, __1721660047_Interface, __1142708526_Interface,
        __1820939821_Interface, __1905429824_Interface, __1387582576_Interface, __988512_Interface)

  private fun as_183308062(): ILaunchActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILaunchActivatedEventArgs.ABI.makeILaunchActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILaunchActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILaunchActivatedEventArgs.ABI.makeILaunchActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  private fun as_1142708526(): IApplicationViewActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewActivatedEventArgs.ABI.makeIApplicationViewActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewActivatedEventArgs.ABI.makeIApplicationViewActivatedEventArgs(ref.value))
  }

  private fun as_1820939821(): IPrelaunchActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrelaunchActivatedEventArgs.ABI.makeIPrelaunchActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrelaunchActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrelaunchActivatedEventArgs.ABI.makeIPrelaunchActivatedEventArgs(ref.value))
  }

  private fun as_1905429824(): IViewSwitcherProvider.WithDefault {
    if(pointer == NULL) {
      return(IViewSwitcherProvider.ABI.makeIViewSwitcherProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IViewSwitcherProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IViewSwitcherProvider.ABI.makeIViewSwitcherProvider(ref.value))
  }

  private fun as_1387582576(): ILaunchActivatedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ILaunchActivatedEventArgs2.ABI.makeILaunchActivatedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILaunchActivatedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILaunchActivatedEventArgs2.ABI.makeILaunchActivatedEventArgs2(ref.value))
  }

  private fun as_988512(): IActivatedEventArgsWithUser.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgsWithUser.ABI.makeIActivatedEventArgsWithUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgsWithUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgsWithUser.ABI.makeIActivatedEventArgsWithUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LaunchActivatedEventArgs> {
    public override fun getValue() = LaunchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LaunchActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LaunchActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LaunchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return LaunchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LaunchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
