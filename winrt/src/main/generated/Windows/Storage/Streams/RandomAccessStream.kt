package Windows.Storage.Streams

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RandomAccessStream.ABI::class)
@WinRTByReference(brClass = RandomAccessStream.ByReference::class)
public class RandomAccessStream(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RandomAccessStream> {
    public override fun getValue() = RandomAccessStream(pointer.getPointer(0))

    public fun setValue(value: RandomAccessStream): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RandomAccessStream, MemoryAddress> {
    public val IRandomAccessStreamStatics_Instance: IRandomAccessStreamStatics by lazy {
      createIRandomAccessStreamStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRandomAccessStreamStatics(): IRandomAccessStreamStatics {
      val refiid = Guid.REFIID(IRandomAccessStreamStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.RandomAccessStream".toHandle(),refiid,interfacePtr)
      val result = IRandomAccessStreamStatics.ABI.makeIRandomAccessStreamStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RandomAccessStream {
      val address = segment.toRawLongValue()
      return RandomAccessStream(Pointer(address))
    }

    public override fun toNative(obj: RandomAccessStream): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CopyAsync(source: IInputStream, destination: IOutputStream) =
        ABI.IRandomAccessStreamStatics_Instance.CopyAsync(source, destination)

    public fun CopyAsync(
      source: IInputStream,
      destination: IOutputStream,
      bytesToCopy: WinDef.ULONG
    ) = ABI.IRandomAccessStreamStatics_Instance.CopyAsync(source, destination, bytesToCopy)

    public fun CopyAndCloseAsync(source: IInputStream, destination: IOutputStream) =
        ABI.IRandomAccessStreamStatics_Instance.CopyAndCloseAsync(source, destination)
  }
}
