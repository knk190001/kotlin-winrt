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

@ABIMarker(MapTileBitmapRequestDeferral.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapTileBitmapRequestDeferral;{fe370542-a4ac-4efa-9665-0490b0cafdd2})")
@WinRTByReference(brClass = MapTileBitmapRequestDeferral.ByReference::class)
public class MapTileBitmapRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapTileBitmapRequestDeferral.WithDefault, IWinRTObject {
  private val __1138371506_Interface: IMapTileBitmapRequestDeferral.WithDefault by lazy {
    as_1138371506()
  }


  public override val __1138371506_Ptr: JNAPointer? by lazy {
    __1138371506_Interface.__1138371506_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1138371506_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1138371506(): IMapTileBitmapRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(IMapTileBitmapRequestDeferral.ABI.makeIMapTileBitmapRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapTileBitmapRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapTileBitmapRequestDeferral.ABI.makeIMapTileBitmapRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapTileBitmapRequestDeferral> {
    public override fun getValue() = MapTileBitmapRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: MapTileBitmapRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapTileBitmapRequestDeferral, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapTileBitmapRequestDeferral".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MapTileBitmapRequestDeferral {
      val address = segment.toRawLongValue()
      return MapTileBitmapRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: MapTileBitmapRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
