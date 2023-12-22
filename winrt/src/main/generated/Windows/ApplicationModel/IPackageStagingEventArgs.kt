package Windows.ApplicationModel

import Windows.Foundation.HResult
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageStagingEventArgs.ABI::class)
@Signature("{1041682d-54e2-4f51-b828-9ef7046c210f}")
@Guid("1041682d54e24f51b8289ef7046c210f")
@WinRTInterface("1041682d54e24f51b8289ef7046c210f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageStagingEventArgs.ByReference::class)
public interface IPackageStagingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Package(): Package?

  @InterfaceMethod(2)
  public fun get_Progress(): Double

  @InterfaceMethod(3)
  public fun get_IsComplete(): Boolean

  @InterfaceMethod(4)
  public fun get_ErrorCode(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageStagingEventArgs> {
    public override fun getValue() = ABI.makeIPackageStagingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPackageStagingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageStagingEventArgs {
    public val __263560579_Ptr: Pointer?

    public val _263560579_VtblPtr: Pointer?
      get() = __263560579_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _263560579_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__263560579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Package(): Package? {
      val fnPtr = _263560579_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__263560579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Progress(): Double {
      val fnPtr = _263560579_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__263560579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsComplete(): Boolean {
      val fnPtr = _263560579_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__263560579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ErrorCode(): HResult? {
      val fnPtr = _263560579_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__263560579_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IPackageStagingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __263560579_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageStagingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1041682d54e24f51b8289ef7046c210f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageStagingEventArgs(ptr: Pointer?): WithDefault =
        IPackageStagingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageStagingEventArgs {
      val address = segment.toRawLongValue()
      return makeIPackageStagingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPackageStagingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__263560579_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageStagingEventArgs):
        Array<IPackageStagingEventArgs?> = (elements as
        Array<IPackageStagingEventArgs?>).castToImpl<IPackageStagingEventArgs,IPackageStagingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageStagingEventArgs?> =
        arrayOfNulls<IPackageStagingEventArgs_Impl>(size) as Array<IPackageStagingEventArgs?>
  }
}
