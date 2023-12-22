package Windows.ApplicationModel.Resources.Core

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

@ABIMarker(IResourceManager2.ABI::class)
@Signature("{9d66fe6c-a4d7-4c23-9e85-675f304c252d}")
@Guid("9d66fe6ca4d74c239e85675f304c252d")
@WinRTInterface("9d66fe6ca4d74c239e85675f304c252d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceManager2.ByReference::class)
public interface IResourceManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAllNamedResourcesForPackage(packageName: String?,
      resourceLayoutInfo: ResourceLayoutInfo?): IVectorView<NamedResource?>?

  @InterfaceMethod(1)
  public fun GetAllSubtreesForPackage(packageName: String?,
      resourceLayoutInfo: ResourceLayoutInfo?): IVectorView<ResourceMap?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceManager2> {
    public override fun getValue() = ABI.makeIResourceManager2(pointer.getPointer(0))

    public fun setValue(value: IResourceManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceManager2 {
    public val __1016163274_Ptr: Pointer?

    public val _1016163274_VtblPtr: Pointer?
      get() = __1016163274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAllNamedResourcesForPackage(packageName: String?,
        resourceLayoutInfo: ResourceLayoutInfo?): IVectorView<NamedResource?>? {
      val fnPtr = _1016163274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<NamedResource?>>()
      val hr = fn.invokeHR(arrayOf(__1016163274_Ptr, marshalToNative(packageName),
          marshalToNative(resourceLayoutInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<NamedResource?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAllSubtreesForPackage(packageName: String?,
        resourceLayoutInfo: ResourceLayoutInfo?): IVectorView<ResourceMap?>? {
      val fnPtr = _1016163274_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ResourceMap?>>()
      val hr = fn.invokeHR(arrayOf(__1016163274_Ptr, marshalToNative(packageName),
          marshalToNative(resourceLayoutInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ResourceMap?>>(result.getValue())
      return resultValue
    }
  }

  public class IResourceManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1016163274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d66fe6ca4d74c239e85675f304c252d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceManager2(ptr: Pointer?): WithDefault = IResourceManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceManager2 {
      val address = segment.toRawLongValue()
      return makeIResourceManager2(Pointer(address))
    }

    public override fun toNative(obj: IResourceManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016163274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceManager2): Array<IResourceManager2?> = (elements
        as Array<IResourceManager2?>).castToImpl<IResourceManager2,IResourceManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceManager2?> =
        arrayOfNulls<IResourceManager2_Impl>(size) as Array<IResourceManager2?>
  }
}
