package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.Media.ITileBrushFactory.ABI.IID
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

@ABIMarker(TileBrush.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.TileBrush;{ee46060d-cabc-505d-883c-75d2e0e45875})")
@WinRTByReference(brClass = TileBrush.ByReference::class)
public open class TileBrush(
  ptr: JNAPointer? = NULL
) : Brush(ptr), ITileBrush.WithDefault, IWinRTObject {
  private val __745308133_Interface: ITileBrush.WithDefault by lazy {
    as_745308133()
  }


  public override val __745308133_Ptr: JNAPointer? by lazy {
    __745308133_Interface.__745308133_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__745308133_Interface)

  public constructor() : this(ABI.activate())

  private fun as_745308133(): ITileBrush.WithDefault {
    if(pointer == NULL) {
      return(ITileBrush.ABI.makeITileBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileBrush.ABI.makeITileBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TileBrush> {
    public override fun getValue() = TileBrush(pointer.getPointer(0))

    public fun setValue(value: TileBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TileBrush, MemoryAddress> {
    public val ITileBrushStatics_Instance: ITileBrushStatics by lazy {
      createITileBrushStatics()
    }


    public val ITileBrushFactory_Instance: ITileBrushFactory by lazy {
      createITileBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITileBrushStatics(): ITileBrushStatics {
      val refiid = Guid.REFIID(ITileBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.TileBrush".toHandle(),refiid,interfacePtr)
      val result = ITileBrushStatics.ABI.makeITileBrushStatics(interfacePtr.value)
      return result
    }

    public fun createITileBrushFactory(): ITileBrushFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.TileBrush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITileBrushFactory.ABI.makeITileBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITileBrushFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TileBrush {
      val address = segment.toRawLongValue()
      return TileBrush(Pointer(address))
    }

    public override fun toNative(obj: TileBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AlignmentXProperty() = ABI.ITileBrushStatics_Instance.get_AlignmentXProperty()

    public fun get_AlignmentYProperty() = ABI.ITileBrushStatics_Instance.get_AlignmentYProperty()

    public fun get_StretchProperty() = ABI.ITileBrushStatics_Instance.get_StretchProperty()
  }
}
