package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
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

@ABIMarker(IDataPackageView2.ABI::class)
@Signature("{40ecba95-2450-4c1d-b6b4-ed45463dee9c}")
@Guid("40ecba9524504c1db6b4ed45463dee9c")
@WinRTInterface("40ecba9524504c1db6b4ed45463dee9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackageView2.ByReference::class)
public interface IDataPackageView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetApplicationLinkAsync(): IAsyncOperation<Uri?>?

  @InterfaceMethod(1)
  public fun GetWebLinkAsync(): IAsyncOperation<Uri?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackageView2> {
    public override fun getValue() = ABI.makeIDataPackageView2(pointer.getPointer(0))

    public fun setValue(value: IDataPackageView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackageView2 {
    public val __1138264293_Ptr: Pointer?

    public val _1138264293_VtblPtr: Pointer?
      get() = __1138264293_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetApplicationLinkAsync(): IAsyncOperation<Uri?>? {
      val fnPtr = _1138264293_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1138264293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetWebLinkAsync(): IAsyncOperation<Uri?>? {
      val fnPtr = _1138264293_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1138264293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Uri?>>(result.getValue())
      return resultValue
    }
  }

  public class IDataPackageView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1138264293_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackageView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40ecba9524504c1db6b4ed45463dee9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackageView2(ptr: Pointer?): WithDefault = IDataPackageView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackageView2 {
      val address = segment.toRawLongValue()
      return makeIDataPackageView2(Pointer(address))
    }

    public override fun toNative(obj: IDataPackageView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1138264293_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackageView2): Array<IDataPackageView2?> = (elements
        as Array<IDataPackageView2?>).castToImpl<IDataPackageView2,IDataPackageView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackageView2?> =
        arrayOfNulls<IDataPackageView2_Impl>(size) as Array<IDataPackageView2?>
  }
}
