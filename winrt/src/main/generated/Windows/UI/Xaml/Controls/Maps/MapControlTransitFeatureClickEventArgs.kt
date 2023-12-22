package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(MapControlTransitFeatureClickEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapControlTransitFeatureClickEventArgs;{76179969-b765-4622-b08a-3072745a4541})")
@WinRTByReference(brClass = MapControlTransitFeatureClickEventArgs.ByReference::class)
public class MapControlTransitFeatureClickEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapControlTransitFeatureClickEventArgs.WithDefault, IWinRTObject {
  private val __8020996_Interface: IMapControlTransitFeatureClickEventArgs.WithDefault by lazy {
    as_8020996()
  }


  public override val __8020996_Ptr: JNAPointer? by lazy {
    __8020996_Interface.__8020996_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__8020996_Interface)

  public constructor() : this(ABI.activate())

  private fun as_8020996(): IMapControlTransitFeatureClickEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapControlTransitFeatureClickEventArgs.ABI.makeIMapControlTransitFeatureClickEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControlTransitFeatureClickEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControlTransitFeatureClickEventArgs.ABI.makeIMapControlTransitFeatureClickEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapControlTransitFeatureClickEventArgs> {
    public override fun getValue() = MapControlTransitFeatureClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapControlTransitFeatureClickEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapControlTransitFeatureClickEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControlTransitFeatureClickEventArgs".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): MapControlTransitFeatureClickEventArgs {
      val address = segment.toRawLongValue()
      return MapControlTransitFeatureClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapControlTransitFeatureClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
