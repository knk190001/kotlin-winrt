package Windows.Services.Maps

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

@ABIMarker(IPlaceInfoCreateOptions.ABI::class)
@Signature("{cd33c125-67f1-4bb3-9907-ecce939b0399}")
@Guid("cd33c12567f14bb39907ecce939b0399")
@WinRTInterface("cd33c12567f14bb39907ecce939b0399")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaceInfoCreateOptions.ByReference::class)
public interface IPlaceInfoCreateOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun put_DisplayAddress(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_DisplayAddress(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaceInfoCreateOptions> {
    public override fun getValue() = ABI.makeIPlaceInfoCreateOptions(pointer.getPointer(0))

    public fun setValue(value: IPlaceInfoCreateOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaceInfoCreateOptions {
    public val __864726022_Ptr: Pointer?

    public val _864726022_VtblPtr: Pointer?
      get() = __864726022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _864726022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__864726022_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _864726022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__864726022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DisplayAddress(value: String?): Unit {
      val fnPtr = _864726022_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__864726022_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_DisplayAddress(): String? {
      val fnPtr = _864726022_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__864726022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPlaceInfoCreateOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __864726022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaceInfoCreateOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd33c12567f14bb39907ecce939b0399")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaceInfoCreateOptions(ptr: Pointer?): WithDefault =
        IPlaceInfoCreateOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaceInfoCreateOptions {
      val address = segment.toRawLongValue()
      return makeIPlaceInfoCreateOptions(Pointer(address))
    }

    public override fun toNative(obj: IPlaceInfoCreateOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__864726022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaceInfoCreateOptions): Array<IPlaceInfoCreateOptions?>
        = (elements as
        Array<IPlaceInfoCreateOptions?>).castToImpl<IPlaceInfoCreateOptions,IPlaceInfoCreateOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaceInfoCreateOptions?> =
        arrayOfNulls<IPlaceInfoCreateOptions_Impl>(size) as Array<IPlaceInfoCreateOptions?>
  }
}
