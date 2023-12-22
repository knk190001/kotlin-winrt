package Windows.UI.Input.Core

import Windows.ApplicationModel.Core.CoreApplicationView
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(RadialControllerIndependentInputSource.ABI::class)
@Signature("rc(Windows.UI.Input.Core.RadialControllerIndependentInputSource;{3d577ef6-4cee-11e6-b535-001bdc06ab3b})")
@WinRTByReference(brClass = RadialControllerIndependentInputSource.ByReference::class)
public class RadialControllerIndependentInputSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerIndependentInputSource.WithDefault,
    IRadialControllerIndependentInputSource2.WithDefault, IWinRTObject {
  private val __1187695677_Interface: IRadialControllerIndependentInputSource.WithDefault by lazy {
    as_1187695677()
  }


  private val __1836139627_Interface: IRadialControllerIndependentInputSource2.WithDefault by lazy {
    as_1836139627()
  }


  public override val __1187695677_Ptr: JNAPointer? by lazy {
    __1187695677_Interface.__1187695677_Ptr
  }


  public override val __1836139627_Ptr: JNAPointer? by lazy {
    __1836139627_Interface.__1836139627_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1187695677_Interface, __1836139627_Interface)

  private fun as_1187695677(): IRadialControllerIndependentInputSource.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerIndependentInputSource.ABI.makeIRadialControllerIndependentInputSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerIndependentInputSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerIndependentInputSource.ABI.makeIRadialControllerIndependentInputSource(ref.value))
  }

  private fun as_1836139627(): IRadialControllerIndependentInputSource2.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerIndependentInputSource2.ABI.makeIRadialControllerIndependentInputSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerIndependentInputSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerIndependentInputSource2.ABI.makeIRadialControllerIndependentInputSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerIndependentInputSource> {
    public override fun getValue() = RadialControllerIndependentInputSource(pointer.getPointer(0))

    public fun setValue(value: RadialControllerIndependentInputSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerIndependentInputSource, MemoryAddress> {
    public val IRadialControllerIndependentInputSourceStatics_Instance:
        IRadialControllerIndependentInputSourceStatics by lazy {
      createIRadialControllerIndependentInputSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadialControllerIndependentInputSourceStatics():
        IRadialControllerIndependentInputSourceStatics {
      val refiid = Guid.REFIID(IRadialControllerIndependentInputSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Core.RadialControllerIndependentInputSource".toHandle(),refiid,interfacePtr)
      val result =
          IRadialControllerIndependentInputSourceStatics.ABI.makeIRadialControllerIndependentInputSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RadialControllerIndependentInputSource {
      val address = segment.toRawLongValue()
      return RadialControllerIndependentInputSource(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerIndependentInputSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForView(view: CoreApplicationView) =
        ABI.IRadialControllerIndependentInputSourceStatics_Instance.CreateForView(view)
  }
}
