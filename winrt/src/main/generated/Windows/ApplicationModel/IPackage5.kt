package Windows.ApplicationModel

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackage5.ABI::class)
@Signature("{0e842dd4-d9ac-45ed-9a1e-74ce056b2635}")
@Guid("0e842dd4d9ac45ed9a1e74ce056b2635")
@WinRTInterface("0e842dd4d9ac45ed9a1e74ce056b2635")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackage5.ByReference::class)
public interface IPackage5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetContentGroupsAsync(): IAsyncOperation<IVector<PackageContentGroup?>?>?

  @InterfaceMethod(1)
  public fun GetContentGroupAsync(name: String?): IAsyncOperation<PackageContentGroup?>?

  @InterfaceMethod(2)
  public fun StageContentGroupsAsync(names: IIterable<String?>?):
      IAsyncOperation<IVector<PackageContentGroup?>?>?

  @InterfaceMethod(3)
  public fun StageContentGroupsAsync(names: IIterable<String?>?, moveToHeadOfQueue: Boolean):
      IAsyncOperation<IVector<PackageContentGroup?>?>?

  @InterfaceMethod(4)
  public fun SetInUseAsync(inUse: Boolean): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPackage5> {
    public override fun getValue() = ABI.makeIPackage5(pointer.getPointer(0))

    public fun setValue(value: IPackage5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackage5 {
    public val __1252479852_Ptr: Pointer?

    public val _1252479852_VtblPtr: Pointer?
      get() = __1252479852_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetContentGroupsAsync(): IAsyncOperation<IVector<PackageContentGroup?>?>? {
      val fnPtr = _1252479852_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<PackageContentGroup?>?>>()
      val hr = fn.invokeHR(arrayOf(__1252479852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<PackageContentGroup?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetContentGroupAsync(name: String?):
        IAsyncOperation<PackageContentGroup?>? {
      val fnPtr = _1252479852_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PackageContentGroup?>>()
      val hr = fn.invokeHR(arrayOf(__1252479852_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PackageContentGroup?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StageContentGroupsAsync(names: IIterable<String?>?):
        IAsyncOperation<IVector<PackageContentGroup?>?>? {
      val fnPtr = _1252479852_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<PackageContentGroup?>?>>()
      val hr = fn.invokeHR(arrayOf(__1252479852_Ptr, marshalToNative(names), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<PackageContentGroup?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun StageContentGroupsAsync(names: IIterable<String?>?,
        moveToHeadOfQueue: Boolean): IAsyncOperation<IVector<PackageContentGroup?>?>? {
      val fnPtr = _1252479852_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<PackageContentGroup?>?>>()
      val hr = fn.invokeHR(arrayOf(__1252479852_Ptr, marshalToNative(names), moveToHeadOfQueue,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<PackageContentGroup?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetInUseAsync(inUse: Boolean): IAsyncOperation<Boolean>? {
      val fnPtr = _1252479852_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1252479852_Ptr, inUse, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IPackage5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252479852_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackage5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e842dd4d9ac45ed9a1e74ce056b2635")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackage5(ptr: Pointer?): WithDefault = IPackage5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackage5 {
      val address = segment.toRawLongValue()
      return makeIPackage5(Pointer(address))
    }

    public override fun toNative(obj: IPackage5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252479852_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage5): Array<IPackage5?> = (elements as
        Array<IPackage5?>).castToImpl<IPackage5,IPackage5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage5?> = arrayOfNulls<IPackage5_Impl>(size)
        as Array<IPackage5?>
  }
}
