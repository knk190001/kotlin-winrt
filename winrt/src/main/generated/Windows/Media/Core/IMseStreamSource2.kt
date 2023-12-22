package Windows.Media.Core

import Windows.Foundation.IReference
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMseStreamSource2.ABI::class)
@Signature("{66f57d37-f9e7-418a-9cde-a020e956552b}")
@Guid("66f57d37f9e7418a9cdea020e956552b")
@WinRTInterface("66f57d37f9e7418a9cdea020e956552b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMseStreamSource2.ByReference::class)
public interface IMseStreamSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LiveSeekableRange(): IReference<MseTimeRange?>?

  @InterfaceMethod(1)
  public fun put_LiveSeekableRange(value: IReference<MseTimeRange?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMseStreamSource2> {
    public override fun getValue() = ABI.makeIMseStreamSource2(pointer.getPointer(0))

    public fun setValue(value: IMseStreamSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMseStreamSource2 {
    public val __962072723_Ptr: Pointer?

    public val _962072723_VtblPtr: Pointer?
      get() = __962072723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LiveSeekableRange(): IReference<MseTimeRange?>? {
      val fnPtr = _962072723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<MseTimeRange?>>()
      val hr = fn.invokeHR(arrayOf(__962072723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<MseTimeRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LiveSeekableRange(value: IReference<MseTimeRange?>?): Unit {
      val fnPtr = _962072723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__962072723_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMseStreamSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __962072723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMseStreamSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66f57d37f9e7418a9cdea020e956552b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMseStreamSource2(ptr: Pointer?): WithDefault = IMseStreamSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMseStreamSource2 {
      val address = segment.toRawLongValue()
      return makeIMseStreamSource2(Pointer(address))
    }

    public override fun toNative(obj: IMseStreamSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__962072723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMseStreamSource2): Array<IMseStreamSource2?> = (elements
        as Array<IMseStreamSource2?>).castToImpl<IMseStreamSource2,IMseStreamSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMseStreamSource2?> =
        arrayOfNulls<IMseStreamSource2_Impl>(size) as Array<IMseStreamSource2?>
  }
}
