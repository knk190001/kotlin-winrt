package Windows.Services.Store

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

@ABIMarker(StoreImage.ABI::class)
@Signature("rc(Windows.Services.Store.StoreImage;{081fd248-adb4-4b64-a993-784789926ed5})")
@WinRTByReference(brClass = StoreImage.ByReference::class)
public class StoreImage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreImage.WithDefault, IWinRTObject {
  private val __74973593_Interface: IStoreImage.WithDefault by lazy {
    as_74973593()
  }


  public override val __74973593_Ptr: JNAPointer? by lazy {
    __74973593_Interface.__74973593_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__74973593_Interface)

  private fun as_74973593(): IStoreImage.WithDefault {
    if(pointer == NULL) {
      return(IStoreImage.ABI.makeIStoreImage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreImage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreImage.ABI.makeIStoreImage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StoreImage> {
    public override fun getValue() = StoreImage(pointer.getPointer(0))

    public fun setValue(value: StoreImage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreImage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreImage {
      val address = segment.toRawLongValue()
      return StoreImage(Pointer(address))
    }

    public override fun toNative(obj: StoreImage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
