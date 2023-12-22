package Windows.ApplicationModel.Core

import Windows.System.DispatcherQueue
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

@ABIMarker(ICoreApplicationView6.ABI::class)
@Signature("{c119d49a-0679-49ba-803f-b79c5cf34cca}")
@Guid("c119d49a067949ba803fb79c5cf34cca")
@WinRTInterface("c119d49a067949ba803fb79c5cf34cca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplicationView6.ByReference::class)
public interface ICoreApplicationView6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplicationView6> {
    public override fun getValue() = ABI.makeICoreApplicationView6(pointer.getPointer(0))

    public fun setValue(value: ICoreApplicationView6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplicationView6 {
    public val __503948960_Ptr: Pointer?

    public val _503948960_VtblPtr: Pointer?
      get() = __503948960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _503948960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__503948960_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }
  }

  public class ICoreApplicationView6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __503948960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplicationView6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c119d49a067949ba803fb79c5cf34cca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplicationView6(ptr: Pointer?): WithDefault =
        ICoreApplicationView6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplicationView6 {
      val address = segment.toRawLongValue()
      return makeICoreApplicationView6(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplicationView6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__503948960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplicationView6): Array<ICoreApplicationView6?> =
        (elements as
        Array<ICoreApplicationView6?>).castToImpl<ICoreApplicationView6,ICoreApplicationView6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplicationView6?> =
        arrayOfNulls<ICoreApplicationView6_Impl>(size) as Array<ICoreApplicationView6?>
  }
}
