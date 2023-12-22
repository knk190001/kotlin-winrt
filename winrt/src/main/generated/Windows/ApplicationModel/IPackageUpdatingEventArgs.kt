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

@ABIMarker(IPackageUpdatingEventArgs.ABI::class)
@Signature("{cd7b4228-fd74-443e-b114-23e677b0e86f}")
@Guid("cd7b4228fd74443eb11423e677b0e86f")
@WinRTInterface("cd7b4228fd74443eb11423e677b0e86f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageUpdatingEventArgs.ByReference::class)
public interface IPackageUpdatingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_SourcePackage(): Package?

  @InterfaceMethod(2)
  public fun get_TargetPackage(): Package?

  @InterfaceMethod(3)
  public fun get_Progress(): Double

  @InterfaceMethod(4)
  public fun get_IsComplete(): Boolean

  @InterfaceMethod(5)
  public fun get_ErrorCode(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageUpdatingEventArgs> {
    public override fun getValue() = ABI.makeIPackageUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPackageUpdatingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageUpdatingEventArgs {
    public val __886493232_Ptr: Pointer?

    public val _886493232_VtblPtr: Pointer?
      get() = __886493232_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _886493232_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__886493232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SourcePackage(): Package? {
      val fnPtr = _886493232_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__886493232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TargetPackage(): Package? {
      val fnPtr = _886493232_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__886493232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Progress(): Double {
      val fnPtr = _886493232_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__886493232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsComplete(): Boolean {
      val fnPtr = _886493232_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__886493232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ErrorCode(): HResult? {
      val fnPtr = _886493232_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__886493232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IPackageUpdatingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __886493232_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageUpdatingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd7b4228fd74443eb11423e677b0e86f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageUpdatingEventArgs(ptr: Pointer?): WithDefault =
        IPackageUpdatingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return makeIPackageUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPackageUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__886493232_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageUpdatingEventArgs):
        Array<IPackageUpdatingEventArgs?> = (elements as
        Array<IPackageUpdatingEventArgs?>).castToImpl<IPackageUpdatingEventArgs,IPackageUpdatingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageUpdatingEventArgs?> =
        arrayOfNulls<IPackageUpdatingEventArgs_Impl>(size) as Array<IPackageUpdatingEventArgs?>
  }
}
