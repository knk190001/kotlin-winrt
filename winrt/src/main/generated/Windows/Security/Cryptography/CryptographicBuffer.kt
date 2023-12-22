package Windows.Security.Cryptography

import Windows.Storage.Streams.IBuffer
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
import com.github.knk190001.winrtbinding.runtime.interop.OutArray
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
import kotlin.Byte
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CryptographicBuffer.ABI::class)
@WinRTByReference(brClass = CryptographicBuffer.ByReference::class)
public class CryptographicBuffer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CryptographicBuffer> {
    public override fun getValue() = CryptographicBuffer(pointer.getPointer(0))

    public fun setValue(value: CryptographicBuffer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CryptographicBuffer, MemoryAddress> {
    public val ICryptographicBufferStatics_Instance: ICryptographicBufferStatics by lazy {
      createICryptographicBufferStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICryptographicBufferStatics(): ICryptographicBufferStatics {
      val refiid = Guid.REFIID(ICryptographicBufferStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.CryptographicBuffer".toHandle(),refiid,interfacePtr)
      val result =
          ICryptographicBufferStatics.ABI.makeICryptographicBufferStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CryptographicBuffer {
      val address = segment.toRawLongValue()
      return CryptographicBuffer(Pointer(address))
    }

    public override fun toNative(obj: CryptographicBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Compare(object1: IBuffer, object2: IBuffer) =
        ABI.ICryptographicBufferStatics_Instance.Compare(object1, object2)

    public fun GenerateRandom(length: WinDef.UINT) =
        ABI.ICryptographicBufferStatics_Instance.GenerateRandom(length)

    public fun GenerateRandomNumber() =
        ABI.ICryptographicBufferStatics_Instance.GenerateRandomNumber()

    public fun CreateFromByteArray(value: Array<Byte>) =
        ABI.ICryptographicBufferStatics_Instance.CreateFromByteArray(value)

    public fun CopyToByteArray(buffer: IBuffer, value: OutArray<Byte>) =
        ABI.ICryptographicBufferStatics_Instance.CopyToByteArray(buffer, value)

    public fun DecodeFromHexString(value: String) =
        ABI.ICryptographicBufferStatics_Instance.DecodeFromHexString(value)

    public fun EncodeToHexString(buffer: IBuffer) =
        ABI.ICryptographicBufferStatics_Instance.EncodeToHexString(buffer)

    public fun DecodeFromBase64String(value: String) =
        ABI.ICryptographicBufferStatics_Instance.DecodeFromBase64String(value)

    public fun EncodeToBase64String(buffer: IBuffer) =
        ABI.ICryptographicBufferStatics_Instance.EncodeToBase64String(buffer)

    public fun ConvertStringToBinary(value: String, encoding: BinaryStringEncoding) =
        ABI.ICryptographicBufferStatics_Instance.ConvertStringToBinary(value, encoding)

    public fun ConvertBinaryToString(encoding: BinaryStringEncoding, buffer: IBuffer) =
        ABI.ICryptographicBufferStatics_Instance.ConvertBinaryToString(encoding, buffer)
  }
}
