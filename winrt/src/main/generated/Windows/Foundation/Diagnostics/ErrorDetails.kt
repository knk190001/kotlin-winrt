package Windows.Foundation.Diagnostics

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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ErrorDetails.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.ErrorDetails;{378cbb01-2cc9-428f-8c55-2c990d463e8f})")
@WinRTByReference(brClass = ErrorDetails.ByReference::class)
public class ErrorDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IErrorDetails.WithDefault, IWinRTObject {
  private val __1481159001_Interface: IErrorDetails.WithDefault by lazy {
    as_1481159001()
  }


  public override val __1481159001_Ptr: JNAPointer? by lazy {
    __1481159001_Interface.__1481159001_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1481159001_Interface)

  private fun as_1481159001(): IErrorDetails.WithDefault {
    if(pointer == NULL) {
      return(IErrorDetails.ABI.makeIErrorDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IErrorDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IErrorDetails.ABI.makeIErrorDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ErrorDetails> {
    public override fun getValue() = ErrorDetails(pointer.getPointer(0))

    public fun setValue(value: ErrorDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ErrorDetails, MemoryAddress> {
    public val IErrorDetailsStatics_Instance: IErrorDetailsStatics by lazy {
      createIErrorDetailsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIErrorDetailsStatics(): IErrorDetailsStatics {
      val refiid = Guid.REFIID(IErrorDetailsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.ErrorDetails".toHandle(),refiid,interfacePtr)
      val result = IErrorDetailsStatics.ABI.makeIErrorDetailsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ErrorDetails {
      val address = segment.toRawLongValue()
      return ErrorDetails(Pointer(address))
    }

    public override fun toNative(obj: ErrorDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromHResultAsync(errorCode: Int) =
        ABI.IErrorDetailsStatics_Instance.CreateFromHResultAsync(errorCode)
  }
}
