package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.Controls.Maps.IMapCustomExperienceFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(MapCustomExperience.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapCustomExperience;{64592866-14a3-4e5f-8883-8e9c500eeede})")
@WinRTByReference(brClass = MapCustomExperience.ByReference::class)
public open class MapCustomExperience(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapCustomExperience.WithDefault, IWinRTObject {
  private val __1533476794_Interface: IMapCustomExperience.WithDefault by lazy {
    as_1533476794()
  }


  public override val __1533476794_Ptr: JNAPointer? by lazy {
    __1533476794_Interface.__1533476794_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1533476794_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1533476794(): IMapCustomExperience.WithDefault {
    if(pointer == NULL) {
      return(IMapCustomExperience.ABI.makeIMapCustomExperience(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapCustomExperience>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapCustomExperience.ABI.makeIMapCustomExperience(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapCustomExperience> {
    public override fun getValue() = MapCustomExperience(pointer.getPointer(0))

    public fun setValue(value: MapCustomExperience): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapCustomExperience, MemoryAddress> {
    public val IMapCustomExperienceFactory_Instance: IMapCustomExperienceFactory by lazy {
      createIMapCustomExperienceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapCustomExperienceFactory(): IMapCustomExperienceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapCustomExperience".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapCustomExperienceFactory.ABI.makeIMapCustomExperienceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMapCustomExperienceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapCustomExperience {
      val address = segment.toRawLongValue()
      return MapCustomExperience(Pointer(address))
    }

    public override fun toNative(obj: MapCustomExperience): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
