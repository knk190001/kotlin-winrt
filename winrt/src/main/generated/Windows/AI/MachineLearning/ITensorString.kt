package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ITensorString.ABI::class)
@Signature("{582335c8-bdb1-4610-bc75-35e9cbf009b7}")
@Guid("582335c8bdb14610bc7535e9cbf009b7")
@WinRTInterface("582335c8bdb14610bc7535e9cbf009b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorString.ByReference::class)
public interface ITensorString : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITensorString>
      {
    public override fun getValue() = ABI.makeITensorString(pointer.getPointer(0))

    public fun setValue(value: ITensorString_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorString {
    public val __783413481_Ptr: Pointer?

    public val _783413481_VtblPtr: Pointer?
      get() = __783413481_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<String?>? {
      val fnPtr = _783413481_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__783413481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorString_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __783413481_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorString, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("582335c8bdb14610bc7535e9cbf009b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorString(ptr: Pointer?): WithDefault = ITensorString_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorString {
      val address = segment.toRawLongValue()
      return makeITensorString(Pointer(address))
    }

    public override fun toNative(obj: ITensorString): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__783413481_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorString): Array<ITensorString?> = (elements as
        Array<ITensorString?>).castToImpl<ITensorString,ITensorString_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorString?> =
        arrayOfNulls<ITensorString_Impl>(size) as Array<ITensorString?>
  }
}
