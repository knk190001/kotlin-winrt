package Windows.Services.Cortana

import Windows.ApplicationModel.DataTransfer.DataPackage
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.System.User
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

@ABIMarker(ICortanaActionableInsights.ABI::class)
@Signature("{951ec6b1-fc83-586d-8b84-2452c8981625}")
@Guid("951ec6b1fc83586d8b842452c8981625")
@WinRTInterface("951ec6b1fc83586d8b842452c8981625")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICortanaActionableInsights.ByReference::class)
public interface ICortanaActionableInsights : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun IsAvailableAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun ShowInsightsForImageAsync(imageStream: IRandomAccessStreamReference?): IAsyncAction?

  @InterfaceMethod(3)
  public fun ShowInsightsForImageAsync(imageStream: IRandomAccessStreamReference?,
      options: CortanaActionableInsightsOptions?): IAsyncAction?

  @InterfaceMethod(4)
  public fun ShowInsightsForTextAsync(text: String?): IAsyncAction?

  @InterfaceMethod(5)
  public fun ShowInsightsForTextAsync(text: String?, options: CortanaActionableInsightsOptions?):
      IAsyncAction?

  @InterfaceMethod(6)
  public fun ShowInsightsAsync(datapackage: DataPackage?): IAsyncAction?

  @InterfaceMethod(7)
  public fun ShowInsightsAsync(datapackage: DataPackage?,
      options: CortanaActionableInsightsOptions?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICortanaActionableInsights> {
    public override fun getValue() = ABI.makeICortanaActionableInsights(pointer.getPointer(0))

    public fun setValue(value: ICortanaActionableInsights_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICortanaActionableInsights {
    public val __560740087_Ptr: Pointer?

    public val _560740087_VtblPtr: Pointer?
      get() = __560740087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _560740087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__560740087_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsAvailableAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _560740087_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__560740087_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ShowInsightsForImageAsync(imageStream: IRandomAccessStreamReference?):
        IAsyncAction? {
      val fnPtr = _560740087_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__560740087_Ptr, marshalToNative(imageStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ShowInsightsForImageAsync(imageStream: IRandomAccessStreamReference?,
        options: CortanaActionableInsightsOptions?): IAsyncAction? {
      val fnPtr = _560740087_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__560740087_Ptr, marshalToNative(imageStream),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ShowInsightsForTextAsync(text: String?): IAsyncAction? {
      val fnPtr = _560740087_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__560740087_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ShowInsightsForTextAsync(text: String?,
        options: CortanaActionableInsightsOptions?): IAsyncAction? {
      val fnPtr = _560740087_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__560740087_Ptr, marshalToNative(text), marshalToNative(options),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ShowInsightsAsync(datapackage: DataPackage?): IAsyncAction? {
      val fnPtr = _560740087_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__560740087_Ptr, marshalToNative(datapackage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ShowInsightsAsync(datapackage: DataPackage?,
        options: CortanaActionableInsightsOptions?): IAsyncAction? {
      val fnPtr = _560740087_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__560740087_Ptr, marshalToNative(datapackage),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICortanaActionableInsights_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __560740087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICortanaActionableInsights, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("951ec6b1fc83586d8b842452c8981625")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICortanaActionableInsights(ptr: Pointer?): WithDefault =
        ICortanaActionableInsights_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICortanaActionableInsights {
      val address = segment.toRawLongValue()
      return makeICortanaActionableInsights(Pointer(address))
    }

    public override fun toNative(obj: ICortanaActionableInsights): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__560740087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICortanaActionableInsights):
        Array<ICortanaActionableInsights?> = (elements as
        Array<ICortanaActionableInsights?>).castToImpl<ICortanaActionableInsights,ICortanaActionableInsights_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICortanaActionableInsights?> =
        arrayOfNulls<ICortanaActionableInsights_Impl>(size) as Array<ICortanaActionableInsights?>
  }
}
