package Windows.Security.EnterpriseData

import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DataProtectionManager.ABI::class)
@WinRTByReference(brClass = DataProtectionManager.ByReference::class)
public class DataProtectionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataProtectionManager> {
    public override fun getValue() = DataProtectionManager(pointer.getPointer(0))

    public fun setValue(value: DataProtectionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataProtectionManager, MemoryAddress> {
    public val IDataProtectionManagerStatics_Instance: IDataProtectionManagerStatics by lazy {
      createIDataProtectionManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDataProtectionManagerStatics(): IDataProtectionManagerStatics {
      val refiid = Guid.REFIID(IDataProtectionManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.DataProtectionManager".toHandle(),refiid,interfacePtr)
      val result =
          IDataProtectionManagerStatics.ABI.makeIDataProtectionManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DataProtectionManager {
      val address = segment.toRawLongValue()
      return DataProtectionManager(Pointer(address))
    }

    public override fun toNative(obj: DataProtectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ProtectAsync(`data`: IBuffer, identity: String) =
        ABI.IDataProtectionManagerStatics_Instance.ProtectAsync(data, identity)

    public fun UnprotectAsync(`data`: IBuffer) =
        ABI.IDataProtectionManagerStatics_Instance.UnprotectAsync(data)

    public fun ProtectStreamAsync(
      unprotectedStream: IInputStream,
      identity: String,
      protectedStream: IOutputStream
    ) = ABI.IDataProtectionManagerStatics_Instance.ProtectStreamAsync(unprotectedStream, identity,
        protectedStream)

    public fun UnprotectStreamAsync(protectedStream: IInputStream, unprotectedStream: IOutputStream)
        = ABI.IDataProtectionManagerStatics_Instance.UnprotectStreamAsync(protectedStream,
        unprotectedStream)

    public fun GetProtectionInfoAsync(protectedData: IBuffer) =
        ABI.IDataProtectionManagerStatics_Instance.GetProtectionInfoAsync(protectedData)

    public fun GetStreamProtectionInfoAsync(protectedStream: IInputStream) =
        ABI.IDataProtectionManagerStatics_Instance.GetStreamProtectionInfoAsync(protectedStream)
  }
}
