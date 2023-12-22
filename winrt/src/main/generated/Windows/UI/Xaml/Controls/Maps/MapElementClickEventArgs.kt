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

@ABIMarker(MapElementClickEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapElementClickEventArgs;{40168a11-d080-4519-99a1-3149fb8999d0})")
@WinRTByReference(brClass = MapElementClickEventArgs.ByReference::class)
public class MapElementClickEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapElementClickEventArgs.WithDefault, IWinRTObject {
  private val __1627813472_Interface: IMapElementClickEventArgs.WithDefault by lazy {
    as_1627813472()
  }


  public override val __1627813472_Ptr: JNAPointer? by lazy {
    __1627813472_Interface.__1627813472_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1627813472_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1627813472(): IMapElementClickEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMapElementClickEventArgs.ABI.makeIMapElementClickEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapElementClickEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapElementClickEventArgs.ABI.makeIMapElementClickEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapElementClickEventArgs> {
    public override fun getValue() = MapElementClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: MapElementClickEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapElementClickEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapElementClickEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapElementClickEventArgs {
      val address = segment.toRawLongValue()
      return MapElementClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MapElementClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
