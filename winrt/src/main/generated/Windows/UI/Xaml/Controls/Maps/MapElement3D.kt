package Windows.UI.Xaml.Controls.Maps

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapElement3D.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapElement3D;{827af8d5-3843-48e2-bd00-0f0644fbe6a5})")
@WinRTByReference(brClass = MapElement3D.ByReference::class)
public class MapElement3D(
  ptr: JNAPointer? = NULL
) : MapElement(ptr), IMapElement3D.WithDefault, IWinRTObject {
  private val __907152318_Interface: IMapElement3D.WithDefault by lazy {
    as_907152318()
  }


  public override val __907152318_Ptr: JNAPointer? by lazy {
    __907152318_Interface.__907152318_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__907152318_Interface)

  public constructor() : this(ABI.activate())

  private fun as_907152318(): IMapElement3D.WithDefault {
    if(pointer == NULL) {
      return(IMapElement3D.ABI.makeIMapElement3D(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapElement3D>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapElement3D.ABI.makeIMapElement3D(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapElement3D> {
    public override fun getValue() = MapElement3D(pointer.getPointer(0))

    public fun setValue(value: MapElement3D): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapElement3D, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMapElement3DStatics_Instance: IMapElement3DStatics by lazy {
      createIMapElement3DStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElement3D".toHandle(),
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

    public fun createIMapElement3DStatics(): IMapElement3DStatics {
      val refiid = Guid.REFIID(IMapElement3DStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElement3D".toHandle(),refiid,interfacePtr)
      val result = IMapElement3DStatics.ABI.makeIMapElement3DStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapElement3D {
      val address = segment.toRawLongValue()
      return MapElement3D(Pointer(address))
    }

    public override fun toNative(obj: MapElement3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LocationProperty() = ABI.IMapElement3DStatics_Instance.get_LocationProperty()

    public fun get_HeadingProperty() = ABI.IMapElement3DStatics_Instance.get_HeadingProperty()

    public fun get_PitchProperty() = ABI.IMapElement3DStatics_Instance.get_PitchProperty()

    public fun get_RollProperty() = ABI.IMapElement3DStatics_Instance.get_RollProperty()

    public fun get_ScaleProperty() = ABI.IMapElement3DStatics_Instance.get_ScaleProperty()
  }
}
