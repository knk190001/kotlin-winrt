package Windows.UI.StartScreen

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

@ABIMarker(TileMixedRealityModel.ABI::class)
@Signature("rc(Windows.UI.StartScreen.TileMixedRealityModel;{b0764e5b-887d-4242-9a19-3d0a4ea78031})")
@WinRTByReference(brClass = TileMixedRealityModel.ByReference::class)
public class TileMixedRealityModel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITileMixedRealityModel.WithDefault, ITileMixedRealityModel2.WithDefault,
    IWinRTObject {
  private val __1920083228_Interface: ITileMixedRealityModel.WithDefault by lazy {
    as_1920083228()
  }


  private val __606962026_Interface: ITileMixedRealityModel2.WithDefault by lazy {
    as_606962026()
  }


  public override val __1920083228_Ptr: JNAPointer? by lazy {
    __1920083228_Interface.__1920083228_Ptr
  }


  public override val __606962026_Ptr: JNAPointer? by lazy {
    __606962026_Interface.__606962026_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1920083228_Interface, __606962026_Interface)

  private fun as_1920083228(): ITileMixedRealityModel.WithDefault {
    if(pointer == NULL) {
      return(ITileMixedRealityModel.ABI.makeITileMixedRealityModel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileMixedRealityModel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileMixedRealityModel.ABI.makeITileMixedRealityModel(ref.value))
  }

  private fun as_606962026(): ITileMixedRealityModel2.WithDefault {
    if(pointer == NULL) {
      return(ITileMixedRealityModel2.ABI.makeITileMixedRealityModel2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITileMixedRealityModel2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITileMixedRealityModel2.ABI.makeITileMixedRealityModel2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TileMixedRealityModel> {
    public override fun getValue() = TileMixedRealityModel(pointer.getPointer(0))

    public fun setValue(value: TileMixedRealityModel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TileMixedRealityModel, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TileMixedRealityModel {
      val address = segment.toRawLongValue()
      return TileMixedRealityModel(Pointer(address))
    }

    public override fun toNative(obj: TileMixedRealityModel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
