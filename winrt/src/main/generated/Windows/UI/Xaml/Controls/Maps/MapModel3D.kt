package Windows.UI.Xaml.Controls.Maps

import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.UI.Xaml.Controls.Maps.IMapModel3DFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapModel3D.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapModel3D;{f8c541a1-ca27-4968-a2bf-9c20f06a0468})")
@WinRTByReference(brClass = MapModel3D.ByReference::class)
public open class MapModel3D(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapModel3D.WithDefault, IWinRTObject {
  private val __775951761_Interface: IMapModel3D.WithDefault by lazy {
    as_775951761()
  }


  public override val __775951761_Ptr: JNAPointer? by lazy {
    __775951761_Interface.__775951761_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__775951761_Interface)

  public constructor() : this(ABI.activate())

  private fun as_775951761(): IMapModel3D.WithDefault {
    if(pointer == NULL) {
      return(IMapModel3D.ABI.makeIMapModel3D(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapModel3D>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapModel3D.ABI.makeIMapModel3D(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapModel3D> {
    public override fun getValue() = MapModel3D(pointer.getPointer(0))

    public fun setValue(value: MapModel3D): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapModel3D, MemoryAddress> {
    public val IMapModel3DStatics_Instance: IMapModel3DStatics by lazy {
      createIMapModel3DStatics()
    }


    public val IMapModel3DFactory_Instance: IMapModel3DFactory by lazy {
      createIMapModel3DFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapModel3DStatics(): IMapModel3DStatics {
      val refiid = Guid.REFIID(IMapModel3DStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapModel3D".toHandle(),refiid,interfacePtr)
      val result = IMapModel3DStatics.ABI.makeIMapModel3DStatics(interfacePtr.value)
      return result
    }

    public fun createIMapModel3DFactory(): IMapModel3DFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapModel3D".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapModel3DFactory.ABI.makeIMapModel3DFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMapModel3DFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapModel3D {
      val address = segment.toRawLongValue()
      return MapModel3D(Pointer(address))
    }

    public override fun toNative(obj: MapModel3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFrom3MFAsync(source: IRandomAccessStreamReference) =
        ABI.IMapModel3DStatics_Instance.CreateFrom3MFAsync(source)

    public fun CreateFrom3MFAsync(source: IRandomAccessStreamReference,
        shadingOption: MapModel3DShadingOption) =
        ABI.IMapModel3DStatics_Instance.CreateFrom3MFAsync(source, shadingOption)
  }
}
