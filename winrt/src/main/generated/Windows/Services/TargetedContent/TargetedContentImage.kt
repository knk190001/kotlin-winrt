package Windows.Services.TargetedContent

import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(TargetedContentImage.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentImage;{a7a585d9-779f-4b1e-bbb1-8eaf53fbeab2})")
@WinRTByReference(brClass = TargetedContentImage.ByReference::class)
public class TargetedContentImage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentImage.WithDefault, IRandomAccessStreamReference.WithDefault,
    IWinRTObject {
  private val __1814453545_Interface: ITargetedContentImage.WithDefault by lazy {
    as_1814453545()
  }


  private val __1417919440_Interface: IRandomAccessStreamReference.WithDefault by lazy {
    as_1417919440()
  }


  public override val __1814453545_Ptr: JNAPointer? by lazy {
    __1814453545_Interface.__1814453545_Ptr
  }


  public override val __1417919440_Ptr: JNAPointer? by lazy {
    __1417919440_Interface.__1417919440_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1814453545_Interface, __1417919440_Interface)

  private fun as_1814453545(): ITargetedContentImage.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentImage.ABI.makeITargetedContentImage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentImage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentImage.ABI.makeITargetedContentImage(ref.value))
  }

  private fun as_1417919440(): IRandomAccessStreamReference.WithDefault {
    if(pointer == NULL) {
      return(IRandomAccessStreamReference.ABI.makeIRandomAccessStreamReference(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRandomAccessStreamReference>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStreamReference.ABI.makeIRandomAccessStreamReference(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentImage> {
    public override fun getValue() = TargetedContentImage(pointer.getPointer(0))

    public fun setValue(value: TargetedContentImage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentImage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetedContentImage {
      val address = segment.toRawLongValue()
      return TargetedContentImage(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentImage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
