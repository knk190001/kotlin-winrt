package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IObservableMap
import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResourceContext.ABI::class)
@Signature("{2fa22f4b-707e-4b27-ad0d-d0d8cd468fd2}")
@Guid("2fa22f4b707e4b27ad0dd0d8cd468fd2")
@WinRTInterface("2fa22f4b707e4b27ad0dd0d8cd468fd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceContext.ByReference::class)
public interface IResourceContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QualifierValues(): IObservableMap<String?, String?>?

  @InterfaceMethod(1)
  public fun Reset(): Unit

  @InterfaceMethod(2)
  public fun Reset(qualifierNames: IIterable<String?>?): Unit

  @InterfaceMethod(3)
  public fun OverrideToMatch(result: IIterable<ResourceQualifier?>?): Unit

  @InterfaceMethod(4)
  public fun Clone(): ResourceContext?

  @InterfaceMethod(5)
  public fun get_Languages(): IVectorView<String?>?

  @InterfaceMethod(6)
  public fun put_Languages(languages: IVectorView<String?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceContext> {
    public override fun getValue() = ABI.makeIResourceContext(pointer.getPointer(0))

    public fun setValue(value: IResourceContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceContext {
    public val __1395976042_Ptr: Pointer?

    public val _1395976042_VtblPtr: Pointer?
      get() = __1395976042_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QualifierValues(): IObservableMap<String?, String?>? {
      val fnPtr = _1395976042_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1395976042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Reset(): Unit {
      val fnPtr = _1395976042_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1395976042_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Reset(qualifierNames: IIterable<String?>?): Unit {
      val fnPtr = _1395976042_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1395976042_Ptr, marshalToNative(qualifierNames),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun OverrideToMatch(result: IIterable<ResourceQualifier?>?): Unit {
      val fnPtr = _1395976042_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1395976042_Ptr, marshalToNative(result),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Clone(): ResourceContext? {
      val fnPtr = _1395976042_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceContext>()
      val hr = fn.invokeHR(arrayOf(__1395976042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Languages(): IVectorView<String?>? {
      val fnPtr = _1395976042_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1395976042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Languages(languages: IVectorView<String?>?): Unit {
      val fnPtr = _1395976042_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1395976042_Ptr, marshalToNative(languages),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IResourceContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1395976042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2fa22f4b707e4b27ad0dd0d8cd468fd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceContext(ptr: Pointer?): WithDefault = IResourceContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceContext {
      val address = segment.toRawLongValue()
      return makeIResourceContext(Pointer(address))
    }

    public override fun toNative(obj: IResourceContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1395976042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceContext): Array<IResourceContext?> = (elements as
        Array<IResourceContext?>).castToImpl<IResourceContext,IResourceContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceContext?> =
        arrayOfNulls<IResourceContext_Impl>(size) as Array<IResourceContext?>
  }
}
