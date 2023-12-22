package Windows.UI.Core

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreDispatcherWithTaskPriority.ABI::class)
@Signature("{bafaecad-484d-41be-ba80-1d58c65263ea}")
@Guid("bafaecad484d41beba801d58c65263ea")
@WinRTInterface("bafaecad484d41beba801d58c65263ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreDispatcherWithTaskPriority.ByReference::class)
public interface ICoreDispatcherWithTaskPriority : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentPriority(): CoreDispatcherPriority?

  @InterfaceMethod(1)
  public fun put_CurrentPriority(value: CoreDispatcherPriority?): Unit

  @InterfaceMethod(2)
  public fun ShouldYield(): Boolean

  @InterfaceMethod(3)
  public fun ShouldYield(priority: CoreDispatcherPriority?): Boolean

  @InterfaceMethod(4)
  public fun StopProcessEvents(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreDispatcherWithTaskPriority> {
    public override fun getValue() = ABI.makeICoreDispatcherWithTaskPriority(pointer.getPointer(0))

    public fun setValue(value: ICoreDispatcherWithTaskPriority_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreDispatcherWithTaskPriority {
    public val __1263944848_Ptr: Pointer?

    public val _1263944848_VtblPtr: Pointer?
      get() = __1263944848_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentPriority(): CoreDispatcherPriority? {
      val fnPtr = _1263944848_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcherPriority>()
      val hr = fn.invokeHR(arrayOf(__1263944848_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcherPriority>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CurrentPriority(value: CoreDispatcherPriority?): Unit {
      val fnPtr = _1263944848_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1263944848_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ShouldYield(): Boolean {
      val fnPtr = _1263944848_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1263944848_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun ShouldYield(priority: CoreDispatcherPriority?): Boolean {
      val fnPtr = _1263944848_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1263944848_Ptr, marshalToNative(priority), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun StopProcessEvents(): Unit {
      val fnPtr = _1263944848_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1263944848_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreDispatcherWithTaskPriority_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1263944848_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreDispatcherWithTaskPriority, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bafaecad484d41beba801d58c65263ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreDispatcherWithTaskPriority(ptr: Pointer?): WithDefault =
        ICoreDispatcherWithTaskPriority_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreDispatcherWithTaskPriority {
      val address = segment.toRawLongValue()
      return makeICoreDispatcherWithTaskPriority(Pointer(address))
    }

    public override fun toNative(obj: ICoreDispatcherWithTaskPriority): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1263944848_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreDispatcherWithTaskPriority):
        Array<ICoreDispatcherWithTaskPriority?> = (elements as
        Array<ICoreDispatcherWithTaskPriority?>).castToImpl<ICoreDispatcherWithTaskPriority,ICoreDispatcherWithTaskPriority_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreDispatcherWithTaskPriority?> =
        arrayOfNulls<ICoreDispatcherWithTaskPriority_Impl>(size) as
        Array<ICoreDispatcherWithTaskPriority?>
  }
}
