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

@ABIMarker(IPackageUninstallingEventArgs.ABI::class)
@Signature("{4443aa52-ab22-44cd-82bb-4ec9b827367a}")
@Guid("4443aa52ab2244cd82bb4ec9b827367a")
@WinRTInterface("4443aa52ab2244cd82bb4ec9b827367a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageUninstallingEventArgs.ByReference::class)
public interface IPackageUninstallingEventArgs : NativeMapped, IWinRTInterface {
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
      IByReference<IPackageUninstallingEventArgs> {
    public override fun getValue() = ABI.makeIPackageUninstallingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPackageUninstallingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageUninstallingEventArgs {
    public val __548659850_Ptr: Pointer?

    public val _548659850_VtblPtr: Pointer?
      get() = __548659850_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _548659850_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__548659850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Package(): Package? {
      val fnPtr = _548659850_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__548659850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Progress(): Double {
      val fnPtr = _548659850_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__548659850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsComplete(): Boolean {
      val fnPtr = _548659850_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__548659850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ErrorCode(): HResult? {
      val fnPtr = _548659850_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__548659850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IPackageUninstallingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __548659850_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageUninstallingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4443aa52ab2244cd82bb4ec9b827367a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageUninstallingEventArgs(ptr: Pointer?): WithDefault =
        IPackageUninstallingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageUninstallingEventArgs {
      val address = segment.toRawLongValue()
      return makeIPackageUninstallingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPackageUninstallingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__548659850_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageUninstallingEventArgs):
        Array<IPackageUninstallingEventArgs?> = (elements as
        Array<IPackageUninstallingEventArgs?>).castToImpl<IPackageUninstallingEventArgs,IPackageUninstallingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageUninstallingEventArgs?> =
        arrayOfNulls<IPackageUninstallingEventArgs_Impl>(size) as
        Array<IPackageUninstallingEventArgs?>
  }
}
