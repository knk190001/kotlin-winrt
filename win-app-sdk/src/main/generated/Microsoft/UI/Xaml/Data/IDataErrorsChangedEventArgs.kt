package Microsoft.UI.Xaml.Data

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IDataErrorsChangedEventArgs.ABI::class)
@Signature("{d026dd64-5f26-5f15-a86a-0dec8a431796}")
@Guid("d026dd645f265f15a86a0dec8a431796")
@WinRTInterface("d026dd645f265f15a86a0dec8a431796")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataErrorsChangedEventArgs.ByReference::class)
public interface IDataErrorsChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PropertyName(): String?

  @InterfaceMethod(1)
  public fun put_PropertyName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataErrorsChangedEventArgs> {
    public override fun getValue() = ABI.makeIDataErrorsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDataErrorsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataErrorsChangedEventArgs {
    public val __995869781_Ptr: Pointer?

    public val _995869781_VtblPtr: Pointer?
      get() = __995869781_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PropertyName(): String? {
      val fnPtr = _995869781_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__995869781_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PropertyName(value: String?): Unit {
      val fnPtr = _995869781_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__995869781_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataErrorsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __995869781_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataErrorsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d026dd645f265f15a86a0dec8a431796")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataErrorsChangedEventArgs(ptr: Pointer?): WithDefault =
        IDataErrorsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataErrorsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDataErrorsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDataErrorsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__995869781_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataErrorsChangedEventArgs):
        Array<IDataErrorsChangedEventArgs?> = (elements as
        Array<IDataErrorsChangedEventArgs?>).castToImpl<IDataErrorsChangedEventArgs,IDataErrorsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataErrorsChangedEventArgs?> =
        arrayOfNulls<IDataErrorsChangedEventArgs_Impl>(size) as Array<IDataErrorsChangedEventArgs?>
  }
}
