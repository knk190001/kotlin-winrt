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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageContentGroupStagingEventArgs.ABI::class)
@Signature("{3d7bc27e-6f27-446c-986e-d4733d4d9113}")
@Guid("3d7bc27e6f27446c986ed4733d4d9113")
@WinRTInterface("3d7bc27e6f27446c986ed4733d4d9113")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageContentGroupStagingEventArgs.ByReference::class)
public interface IPackageContentGroupStagingEventArgs : NativeMapped, IWinRTInterface {
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

  @InterfaceMethod(5)
  public fun get_ContentGroupName(): String?

  @InterfaceMethod(6)
  public fun get_IsContentGroupRequired(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageContentGroupStagingEventArgs> {
    public override fun getValue() =
        ABI.makeIPackageContentGroupStagingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPackageContentGroupStagingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageContentGroupStagingEventArgs {
    public val __1818376541_Ptr: Pointer?

    public val _1818376541_VtblPtr: Pointer?
      get() = __1818376541_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1818376541_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1818376541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Package(): Package? {
      val fnPtr = _1818376541_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__1818376541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Progress(): Double {
      val fnPtr = _1818376541_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1818376541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsComplete(): Boolean {
      val fnPtr = _1818376541_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1818376541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ErrorCode(): HResult? {
      val fnPtr = _1818376541_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1818376541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ContentGroupName(): String? {
      val fnPtr = _1818376541_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1818376541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsContentGroupRequired(): Boolean {
      val fnPtr = _1818376541_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1818376541_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPackageContentGroupStagingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1818376541_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageContentGroupStagingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d7bc27e6f27446c986ed4733d4d9113")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageContentGroupStagingEventArgs(ptr: Pointer?): WithDefault =
        IPackageContentGroupStagingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageContentGroupStagingEventArgs {
      val address = segment.toRawLongValue()
      return makeIPackageContentGroupStagingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPackageContentGroupStagingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1818376541_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageContentGroupStagingEventArgs):
        Array<IPackageContentGroupStagingEventArgs?> = (elements as
        Array<IPackageContentGroupStagingEventArgs?>).castToImpl<IPackageContentGroupStagingEventArgs,IPackageContentGroupStagingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageContentGroupStagingEventArgs?> =
        arrayOfNulls<IPackageContentGroupStagingEventArgs_Impl>(size) as
        Array<IPackageContentGroupStagingEventArgs?>
  }
}
