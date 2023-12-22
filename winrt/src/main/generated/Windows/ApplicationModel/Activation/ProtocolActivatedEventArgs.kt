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

@ABIMarker(ProtocolActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs;{6095f4dd-b7c0-46ab-81fe-d90f36d00d24})")
@WinRTByReference(brClass = ProtocolActivatedEventArgs.ByReference::class)
public class ProtocolActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtocolActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData.WithDefault,
    IApplicationViewActivatedEventArgs.WithDefault, IViewSwitcherProvider.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __1709469255_Interface: IProtocolActivatedEventArgs.WithDefault by lazy {
    as_1709469255()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __2110665436_Interface:
      IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData.WithDefault by lazy {
    as_2110665436()
  }


  private val __1142708526_Interface: IApplicationViewActivatedEventArgs.WithDefault by lazy {
    as_1142708526()
  }


  private val __1905429824_Interface: IViewSwitcherProvider.WithDefault by lazy {
    as_1905429824()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __1709469255_Ptr: JNAPointer? by lazy {
    __1709469255_Interface.__1709469255_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __2110665436_Ptr: JNAPointer? by lazy {
    __2110665436_Interface.__2110665436_Ptr
  }


  public override val __1142708526_Ptr: JNAPointer? by lazy {
    __1142708526_Interface.__1142708526_Ptr
  }


  public override val __1905429824_Ptr: JNAPointer? by lazy {
    __1905429824_Interface.__1905429824_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1709469255_Interface, __1721660047_Interface, __2110665436_Interface,
        __1142708526_Interface, __1905429824_Interface, __988512_Interface)

  private fun as_1709469255(): IProtocolActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IProtocolActivatedEventArgs.ABI.makeIProtocolActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtocolActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtocolActivatedEventArgs.ABI.makeIProtocolActivatedEventArgs(ref.value))
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

  private fun as_2110665436():
      IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData.WithDefault {
    if(pointer == NULL) {
      return(IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData.ABI.makeIProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData(NULL))
    }
    val refiid =
        Guid.REFIID(guidOf<IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData.ABI.makeIProtocolActivatedEventArgsWithCallerPackageFamilyNameAndData(ref.value))
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

  private fun as_1905429824(): IViewSwitcherProvider.WithDefault {
    if(pointer == NULL) {
      return(IViewSwitcherProvider.ABI.makeIViewSwitcherProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IViewSwitcherProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IViewSwitcherProvider.ABI.makeIViewSwitcherProvider(ref.value))
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
      IByReference<ProtocolActivatedEventArgs> {
    public override fun getValue() = ProtocolActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ProtocolActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtocolActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProtocolActivatedEventArgs {
      val address = segment.toRawLongValue()
      return ProtocolActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ProtocolActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
