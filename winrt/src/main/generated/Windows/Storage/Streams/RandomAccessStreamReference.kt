package Windows.Storage.Streams

import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RandomAccessStreamReference.ABI::class)
@Signature("rc(Windows.Storage.Streams.RandomAccessStreamReference;{33ee3134-1dd6-4e3a-8067-d1c162e8642b})")
@WinRTByReference(brClass = RandomAccessStreamReference.ByReference::class)
public class RandomAccessStreamReference(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRandomAccessStreamReference.WithDefault, IWinRTObject {
  private val __1417919440_Interface: IRandomAccessStreamReference.WithDefault by lazy {
    as_1417919440()
  }


  public override val __1417919440_Ptr: JNAPointer? by lazy {
    __1417919440_Interface.__1417919440_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1417919440_Interface)

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
      IByReference<RandomAccessStreamReference> {
    public override fun getValue() = RandomAccessStreamReference(pointer.getPointer(0))

    public fun setValue(value: RandomAccessStreamReference): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RandomAccessStreamReference, MemoryAddress> {
    public val IRandomAccessStreamReferenceStatics_Instance: IRandomAccessStreamReferenceStatics by
        lazy {
      createIRandomAccessStreamReferenceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRandomAccessStreamReferenceStatics(): IRandomAccessStreamReferenceStatics {
      val refiid = Guid.REFIID(IRandomAccessStreamReferenceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.RandomAccessStreamReference".toHandle(),refiid,interfacePtr)
      val result =
          IRandomAccessStreamReferenceStatics.ABI.makeIRandomAccessStreamReferenceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RandomAccessStreamReference {
      val address = segment.toRawLongValue()
      return RandomAccessStreamReference(Pointer(address))
    }

    public override fun toNative(obj: RandomAccessStreamReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromFile(`file`: IStorageFile) =
        ABI.IRandomAccessStreamReferenceStatics_Instance.CreateFromFile(file)

    public fun CreateFromUri(uri: Uri) =
        ABI.IRandomAccessStreamReferenceStatics_Instance.CreateFromUri(uri)

    public fun CreateFromStream(stream: IRandomAccessStream) =
        ABI.IRandomAccessStreamReferenceStatics_Instance.CreateFromStream(stream)
  }
}
