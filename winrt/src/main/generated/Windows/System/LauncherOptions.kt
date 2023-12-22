package Windows.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(LauncherOptions.ABI::class)
@Signature("rc(Windows.System.LauncherOptions;{3ba08eb4-6e40-4dce-a1a3-2f53950afb49})")
@WinRTByReference(brClass = LauncherOptions.ByReference::class)
public class LauncherOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILauncherOptions2.WithDefault, ILauncherOptions.WithDefault,
    ILauncherOptions3.WithDefault, ILauncherOptions4.WithDefault, ILauncherViewOptions.WithDefault,
    IWinRTObject {
  private val __1132038787_Interface: ILauncherOptions2.WithDefault by lazy {
    as_1132038787()
  }


  private val __452159375_Interface: ILauncherOptions.WithDefault by lazy {
    as_452159375()
  }


  private val __1132038788_Interface: ILauncherOptions3.WithDefault by lazy {
    as_1132038788()
  }


  private val __1132038789_Interface: ILauncherOptions4.WithDefault by lazy {
    as_1132038789()
  }


  private val __432697174_Interface: ILauncherViewOptions.WithDefault by lazy {
    as_432697174()
  }


  public override val __1132038787_Ptr: JNAPointer? by lazy {
    __1132038787_Interface.__1132038787_Ptr
  }


  public override val __452159375_Ptr: JNAPointer? by lazy {
    __452159375_Interface.__452159375_Ptr
  }


  public override val __1132038788_Ptr: JNAPointer? by lazy {
    __1132038788_Interface.__1132038788_Ptr
  }


  public override val __1132038789_Ptr: JNAPointer? by lazy {
    __1132038789_Interface.__1132038789_Ptr
  }


  public override val __432697174_Ptr: JNAPointer? by lazy {
    __432697174_Interface.__432697174_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1132038787_Interface, __452159375_Interface, __1132038788_Interface,
        __1132038789_Interface, __432697174_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1132038787(): ILauncherOptions2.WithDefault {
    if(pointer == NULL) {
      return(ILauncherOptions2.ABI.makeILauncherOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILauncherOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILauncherOptions2.ABI.makeILauncherOptions2(ref.value))
  }

  private fun as_452159375(): ILauncherOptions.WithDefault {
    if(pointer == NULL) {
      return(ILauncherOptions.ABI.makeILauncherOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILauncherOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILauncherOptions.ABI.makeILauncherOptions(ref.value))
  }

  private fun as_1132038788(): ILauncherOptions3.WithDefault {
    if(pointer == NULL) {
      return(ILauncherOptions3.ABI.makeILauncherOptions3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILauncherOptions3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILauncherOptions3.ABI.makeILauncherOptions3(ref.value))
  }

  private fun as_1132038789(): ILauncherOptions4.WithDefault {
    if(pointer == NULL) {
      return(ILauncherOptions4.ABI.makeILauncherOptions4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILauncherOptions4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILauncherOptions4.ABI.makeILauncherOptions4(ref.value))
  }

  private fun as_432697174(): ILauncherViewOptions.WithDefault {
    if(pointer == NULL) {
      return(ILauncherViewOptions.ABI.makeILauncherViewOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILauncherViewOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILauncherViewOptions.ABI.makeILauncherViewOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LauncherOptions> {
    public override fun getValue() = LauncherOptions(pointer.getPointer(0))

    public fun setValue(value: LauncherOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LauncherOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.System.LauncherOptions".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): LauncherOptions {
      val address = segment.toRawLongValue()
      return LauncherOptions(Pointer(address))
    }

    public override fun toNative(obj: LauncherOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
