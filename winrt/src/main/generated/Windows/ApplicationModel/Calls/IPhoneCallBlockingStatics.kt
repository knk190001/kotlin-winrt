package Windows.ApplicationModel.Calls

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallBlockingStatics.ABI::class)
@Signature("{19646f84-2b79-26f1-a46f-694be043f313}")
@Guid("19646f842b7926f1a46f694be043f313")
@WinRTInterface("19646f842b7926f1a46f694be043f313")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallBlockingStatics.ByReference::class)
public interface IPhoneCallBlockingStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BlockUnknownNumbers(): Boolean

  @InterfaceMethod(1)
  public fun put_BlockUnknownNumbers(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_BlockPrivateNumbers(): Boolean

  @InterfaceMethod(3)
  public fun put_BlockPrivateNumbers(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun SetCallBlockingListAsync(phoneNumberList: IIterable<String?>?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallBlockingStatics> {
    public override fun getValue() = ABI.makeIPhoneCallBlockingStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallBlockingStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallBlockingStatics {
    public val __1742050242_Ptr: Pointer?

    public val _1742050242_VtblPtr: Pointer?
      get() = __1742050242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BlockUnknownNumbers(): Boolean {
      val fnPtr = _1742050242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1742050242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BlockUnknownNumbers(value: Boolean): Unit {
      val fnPtr = _1742050242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1742050242_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BlockPrivateNumbers(): Boolean {
      val fnPtr = _1742050242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1742050242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_BlockPrivateNumbers(value: Boolean): Unit {
      val fnPtr = _1742050242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1742050242_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetCallBlockingListAsync(phoneNumberList: IIterable<String?>?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1742050242_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1742050242_Ptr, marshalToNative(phoneNumberList), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallBlockingStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1742050242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallBlockingStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19646f842b7926f1a46f694be043f313")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallBlockingStatics(ptr: Pointer?): WithDefault =
        IPhoneCallBlockingStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallBlockingStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneCallBlockingStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallBlockingStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1742050242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallBlockingStatics):
        Array<IPhoneCallBlockingStatics?> = (elements as
        Array<IPhoneCallBlockingStatics?>).castToImpl<IPhoneCallBlockingStatics,IPhoneCallBlockingStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallBlockingStatics?> =
        arrayOfNulls<IPhoneCallBlockingStatics_Impl>(size) as Array<IPhoneCallBlockingStatics?>
  }
}
