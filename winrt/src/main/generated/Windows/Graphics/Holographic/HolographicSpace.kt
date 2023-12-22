package Windows.Graphics.Holographic

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Core.CoreWindow
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(HolographicSpace.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicSpace;{4380dba6-5e78-434f-807c-3433d1efe8b7})")
@WinRTByReference(brClass = HolographicSpace.ByReference::class)
public class HolographicSpace(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicSpace.WithDefault, IHolographicSpace2.WithDefault,
    IHolographicSpace3.WithDefault, IWinRTObject {
  private val __1939254603_Interface: IHolographicSpace.WithDefault by lazy {
    as_1939254603()
  }


  private val __12649401_Interface: IHolographicSpace2.WithDefault by lazy {
    as_12649401()
  }


  private val __12649400_Interface: IHolographicSpace3.WithDefault by lazy {
    as_12649400()
  }


  public override val __1939254603_Ptr: JNAPointer? by lazy {
    __1939254603_Interface.__1939254603_Ptr
  }


  public override val __12649401_Ptr: JNAPointer? by lazy {
    __12649401_Interface.__12649401_Ptr
  }


  public override val __12649400_Ptr: JNAPointer? by lazy {
    __12649400_Interface.__12649400_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1939254603_Interface, __12649401_Interface, __12649400_Interface)

  private fun as_1939254603(): IHolographicSpace.WithDefault {
    if(pointer == NULL) {
      return(IHolographicSpace.ABI.makeIHolographicSpace(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicSpace>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicSpace.ABI.makeIHolographicSpace(ref.value))
  }

  private fun as_12649401(): IHolographicSpace2.WithDefault {
    if(pointer == NULL) {
      return(IHolographicSpace2.ABI.makeIHolographicSpace2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicSpace2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicSpace2.ABI.makeIHolographicSpace2(ref.value))
  }

  private fun as_12649400(): IHolographicSpace3.WithDefault {
    if(pointer == NULL) {
      return(IHolographicSpace3.ABI.makeIHolographicSpace3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicSpace3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicSpace3.ABI.makeIHolographicSpace3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicSpace> {
    public override fun getValue() = HolographicSpace(pointer.getPointer(0))

    public fun setValue(value: HolographicSpace): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicSpace, MemoryAddress> {
    public val IHolographicSpaceStatics3_Instance: IHolographicSpaceStatics3 by lazy {
      createIHolographicSpaceStatics3()
    }


    public val IHolographicSpaceStatics_Instance: IHolographicSpaceStatics by lazy {
      createIHolographicSpaceStatics()
    }


    public val IHolographicSpaceStatics2_Instance: IHolographicSpaceStatics2 by lazy {
      createIHolographicSpaceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHolographicSpaceStatics3(): IHolographicSpaceStatics3 {
      val refiid = Guid.REFIID(IHolographicSpaceStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Holographic.HolographicSpace".toHandle(),refiid,interfacePtr)
      val result = IHolographicSpaceStatics3.ABI.makeIHolographicSpaceStatics3(interfacePtr.value)
      return result
    }

    public fun createIHolographicSpaceStatics(): IHolographicSpaceStatics {
      val refiid = Guid.REFIID(IHolographicSpaceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Holographic.HolographicSpace".toHandle(),refiid,interfacePtr)
      val result = IHolographicSpaceStatics.ABI.makeIHolographicSpaceStatics(interfacePtr.value)
      return result
    }

    public fun createIHolographicSpaceStatics2(): IHolographicSpaceStatics2 {
      val refiid = Guid.REFIID(IHolographicSpaceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Holographic.HolographicSpace".toHandle(),refiid,interfacePtr)
      val result = IHolographicSpaceStatics2.ABI.makeIHolographicSpaceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HolographicSpace {
      val address = segment.toRawLongValue()
      return HolographicSpace(Pointer(address))
    }

    public override fun toNative(obj: HolographicSpace): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsConfigured() = ABI.IHolographicSpaceStatics3_Instance.get_IsConfigured()

    public fun CreateForCoreWindow(window: CoreWindow) =
        ABI.IHolographicSpaceStatics_Instance.CreateForCoreWindow(window)

    public fun get_IsSupported() = ABI.IHolographicSpaceStatics2_Instance.get_IsSupported()

    public fun get_IsAvailable() = ABI.IHolographicSpaceStatics2_Instance.get_IsAvailable()

    public fun add_IsAvailableChanged(handler: EventHandler<IUnknown?>) =
        ABI.IHolographicSpaceStatics2_Instance.add_IsAvailableChanged(handler)

    public fun remove_IsAvailableChanged(token: EventRegistrationToken) =
        ABI.IHolographicSpaceStatics2_Instance.remove_IsAvailableChanged(token)
  }
}
