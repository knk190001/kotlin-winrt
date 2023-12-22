package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(INamedResource.ABI::class)
@Signature("{1c98c219-0b13-4240-89a5-d495dc189a00}")
@Guid("1c98c2190b13424089a5d495dc189a00")
@WinRTInterface("1c98c2190b13424089a5d495dc189a00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INamedResource.ByReference::class)
public interface INamedResource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_Candidates(): IVectorView<ResourceCandidate?>?

  @InterfaceMethod(2)
  public fun Resolve(): ResourceCandidate?

  @InterfaceMethod(3)
  public fun Resolve(resourceContext: ResourceContext?): ResourceCandidate?

  @InterfaceMethod(4)
  public fun ResolveAll(): IVectorView<ResourceCandidate?>?

  @InterfaceMethod(5)
  public fun ResolveAll(resourceContext: ResourceContext?): IVectorView<ResourceCandidate?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INamedResource>
      {
    public override fun getValue() = ABI.makeINamedResource(pointer.getPointer(0))

    public fun setValue(value: INamedResource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INamedResource {
    public val __1680668240_Ptr: Pointer?

    public val _1680668240_VtblPtr: Pointer?
      get() = __1680668240_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1680668240_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1680668240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Candidates(): IVectorView<ResourceCandidate?>? {
      val fnPtr = _1680668240_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ResourceCandidate?>>()
      val hr = fn.invokeHR(arrayOf(__1680668240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ResourceCandidate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Resolve(): ResourceCandidate? {
      val fnPtr = _1680668240_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__1680668240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Resolve(resourceContext: ResourceContext?): ResourceCandidate? {
      val fnPtr = _1680668240_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__1680668240_Ptr, marshalToNative(resourceContext), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ResolveAll(): IVectorView<ResourceCandidate?>? {
      val fnPtr = _1680668240_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ResourceCandidate?>>()
      val hr = fn.invokeHR(arrayOf(__1680668240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ResourceCandidate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ResolveAll(resourceContext: ResourceContext?):
        IVectorView<ResourceCandidate?>? {
      val fnPtr = _1680668240_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ResourceCandidate?>>()
      val hr = fn.invokeHR(arrayOf(__1680668240_Ptr, marshalToNative(resourceContext), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ResourceCandidate?>>(result.getValue())
      return resultValue
    }
  }

  public class INamedResource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1680668240_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INamedResource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c98c2190b13424089a5d495dc189a00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINamedResource(ptr: Pointer?): WithDefault = INamedResource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INamedResource {
      val address = segment.toRawLongValue()
      return makeINamedResource(Pointer(address))
    }

    public override fun toNative(obj: INamedResource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1680668240_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INamedResource): Array<INamedResource?> = (elements as
        Array<INamedResource?>).castToImpl<INamedResource,INamedResource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INamedResource?> =
        arrayOfNulls<INamedResource_Impl>(size) as Array<INamedResource?>
  }
}
