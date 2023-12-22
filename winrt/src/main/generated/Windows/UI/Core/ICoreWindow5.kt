package Windows.UI.Core

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

@ABIMarker(ICoreWindow5.ABI::class)
@Signature("{4b4ae1e1-2e6d-4eaa-bda1-1c5cc1bee141}")
@Guid("4b4ae1e12e6d4eaabda11c5cc1bee141")
@WinRTInterface("4b4ae1e12e6d4eaabda11c5cc1bee141")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindow5.ByReference::class)
public interface ICoreWindow5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(1)
  public fun get_ActivationMode(): CoreWindowActivationMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICoreWindow5> {
    public override fun getValue() = ABI.makeICoreWindow5(pointer.getPointer(0))

    public fun setValue(value: ICoreWindow5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindow5 {
    public val __1001563413_Ptr: Pointer?

    public val _1001563413_VtblPtr: Pointer?
      get() = __1001563413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1001563413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1001563413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ActivationMode(): CoreWindowActivationMode? {
      val fnPtr = _1001563413_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindowActivationMode>()
      val hr = fn.invokeHR(arrayOf(__1001563413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindowActivationMode>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWindow5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1001563413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindow5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b4ae1e12e6d4eaabda11c5cc1bee141")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindow5(ptr: Pointer?): WithDefault = ICoreWindow5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindow5 {
      val address = segment.toRawLongValue()
      return makeICoreWindow5(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindow5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1001563413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindow5): Array<ICoreWindow5?> = (elements as
        Array<ICoreWindow5?>).castToImpl<ICoreWindow5,ICoreWindow5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindow5?> =
        arrayOfNulls<ICoreWindow5_Impl>(size) as Array<ICoreWindow5?>
  }
}
