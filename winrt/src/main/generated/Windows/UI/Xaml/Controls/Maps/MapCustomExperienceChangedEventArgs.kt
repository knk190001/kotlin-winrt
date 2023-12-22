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

@ABIMarker(MapCustomExperienceChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapCustomExperienceChangedEventArgs;{b9e6fb9b-8fc1-4042-ac34-a61b38bb7514})")
@WinRTByReference(brClass = MapCustomExperienceChangedEventArgs.ByReference::class)
public class MapCustomExperienceChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapCustomExperienceChangedEventArgs.WithDefault, IWinRTObject {
  private val __1184933207_Interface: IMapCustomExperienceChangedEventArgs.WithDefault by lazy {
    as_1184933207()
  }


  public override val __1184933207_Ptr: JNAPointer? by lazy {
    __1184933207_Interface.__1184933207_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1184933207_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1184933207(): IMapCustomExperienceChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapCustomExperienceChangedEventArgs.ABI.makeIMapCustomExperienceChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapCustomExperienceChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapCustomExperienceChangedEventArgs.ABI.makeIMapCustomExperienceChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapCustomExperienceChangedEventArgs> {
    public override fun getValue() = MapCustomExperienceChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapCustomExperienceChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapCustomExperienceChangedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapCustomExperienceChangedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapCustomExperienceChangedEventArgs {
      val address = segment.toRawLongValue()
      return MapCustomExperienceChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapCustomExperienceChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
