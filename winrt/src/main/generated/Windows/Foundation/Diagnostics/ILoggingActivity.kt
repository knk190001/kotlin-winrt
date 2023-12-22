package Windows.Foundation.Diagnostics

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILoggingActivity.ABI::class)
@Signature("{bc032941-b766-4cb5-9848-97ac6ba6d60c}")
@Guid("bc032941b7664cb5984897ac6ba6d60c")
@WinRTInterface("bc032941b7664cb5984897ac6ba6d60c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoggingActivity.ByReference::class)
public interface ILoggingActivity : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Id(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoggingActivity> {
    public override fun getValue() = ABI.makeILoggingActivity(pointer.getPointer(0))

    public fun setValue(value: ILoggingActivity_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoggingActivity, IClosable.WithDefault {
    public val __1778097377_Ptr: Pointer?

    public val _1778097377_VtblPtr: Pointer?
      get() = __1778097377_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1778097377_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1778097377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1778097377_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1778097377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class ILoggingActivity_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1778097377_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1778097377_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoggingActivity, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc032941b7664cb5984897ac6ba6d60c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoggingActivity(ptr: Pointer?): WithDefault = ILoggingActivity_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoggingActivity {
      val address = segment.toRawLongValue()
      return makeILoggingActivity(Pointer(address))
    }

    public override fun toNative(obj: ILoggingActivity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1778097377_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoggingActivity): Array<ILoggingActivity?> = (elements as
        Array<ILoggingActivity?>).castToImpl<ILoggingActivity,ILoggingActivity_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoggingActivity?> =
        arrayOfNulls<ILoggingActivity_Impl>(size) as Array<ILoggingActivity?>
  }
}
