package Microsoft.Windows.ApplicationModel.Resources

import Windows.Foundation.Collections.IKeyValuePair
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IResourceMap.ABI::class)
@Signature("{4abbd9bc-df4e-5c7b-812c-7e7bb0c22377}")
@Guid("4abbd9bcdf4e5c7b812c7e7bb0c22377")
@WinRTInterface("4abbd9bcdf4e5c7b812c7e7bb0c22377")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceMap.ByReference::class)
public interface IResourceMap : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResourceCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun GetSubtree(reference: String?): ResourceMap?

  @InterfaceMethod(2)
  public fun TryGetSubtree(reference: String?): ResourceMap?

  @InterfaceMethod(3)
  public fun GetValue(resource: String?): ResourceCandidate?

  @InterfaceMethod(4)
  public fun GetValue(resource: String?, context: ResourceContext?): ResourceCandidate?

  @InterfaceMethod(5)
  public fun GetValueByIndex(index: WinDef.UINT): IKeyValuePair<String?, ResourceCandidate?>?

  @InterfaceMethod(6)
  public fun GetValueByIndex(index: WinDef.UINT, context: ResourceContext?): IKeyValuePair<String?,
      ResourceCandidate?>?

  @InterfaceMethod(7)
  public fun TryGetValue(resource: String?): ResourceCandidate?

  @InterfaceMethod(8)
  public fun TryGetValue(resource: String?, context: ResourceContext?): ResourceCandidate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IResourceMap> {
    public override fun getValue() = ABI.makeIResourceMap(pointer.getPointer(0))

    public fun setValue(value: IResourceMap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceMap {
    public val __653112416_Ptr: Pointer?

    public val _653112416_VtblPtr: Pointer?
      get() = __653112416_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResourceCount(): WinDef.UINT {
      val fnPtr = _653112416_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetSubtree(reference: String?): ResourceMap? {
      val fnPtr = _653112416_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceMap>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr, marshalToNative(reference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceMap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryGetSubtree(reference: String?): ResourceMap? {
      val fnPtr = _653112416_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceMap>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr, marshalToNative(reference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceMap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetValue(resource: String?): ResourceCandidate? {
      val fnPtr = _653112416_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr, marshalToNative(resource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetValue(resource: String?, context: ResourceContext?): ResourceCandidate? {
      val fnPtr = _653112416_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr, marshalToNative(resource),
          marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetValueByIndex(index: WinDef.UINT): IKeyValuePair<String?,
        ResourceCandidate?>? {
      val fnPtr = _653112416_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IKeyValuePair<String?, ResourceCandidate?>>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IKeyValuePair<String?,
          ResourceCandidate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetValueByIndex(index: WinDef.UINT, context: ResourceContext?):
        IKeyValuePair<String?, ResourceCandidate?>? {
      val fnPtr = _653112416_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IKeyValuePair<String?, ResourceCandidate?>>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr, index, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IKeyValuePair<String?,
          ResourceCandidate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TryGetValue(resource: String?): ResourceCandidate? {
      val fnPtr = _653112416_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr, marshalToNative(resource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun TryGetValue(resource: String?, context: ResourceContext?):
        ResourceCandidate? {
      val fnPtr = _653112416_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__653112416_Ptr, marshalToNative(resource),
          marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceCandidate>(result.getValue())
      return resultValue
    }
  }

  public class IResourceMap_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653112416_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceMap, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4abbd9bcdf4e5c7b812c7e7bb0c22377")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceMap(ptr: Pointer?): WithDefault = IResourceMap_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceMap {
      val address = segment.toRawLongValue()
      return makeIResourceMap(Pointer(address))
    }

    public override fun toNative(obj: IResourceMap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__653112416_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceMap): Array<IResourceMap?> = (elements as
        Array<IResourceMap?>).castToImpl<IResourceMap,IResourceMap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceMap?> =
        arrayOfNulls<IResourceMap_Impl>(size) as Array<IResourceMap?>
  }
}
