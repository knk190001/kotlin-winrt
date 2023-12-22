package Windows.Services.TargetedContent

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

@ABIMarker(ITargetedContentObject.ABI::class)
@Signature("{041d7969-2212-42d1-9dfa-88a8e3033aa3}")
@Guid("041d7969221242d19dfa88a8e3033aa3")
@WinRTInterface("041d7969221242d19dfa88a8e3033aa3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentObject.ByReference::class)
public interface ITargetedContentObject : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ObjectKind(): TargetedContentObjectKind?

  @InterfaceMethod(1)
  public fun get_Collection(): TargetedContentCollection?

  @InterfaceMethod(2)
  public fun get_Item(): TargetedContentItem?

  @InterfaceMethod(3)
  public fun get_Value(): TargetedContentValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentObject> {
    public override fun getValue() = ABI.makeITargetedContentObject(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentObject {
    public val __251602621_Ptr: Pointer?

    public val _251602621_VtblPtr: Pointer?
      get() = __251602621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ObjectKind(): TargetedContentObjectKind? {
      val fnPtr = _251602621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentObjectKind>()
      val hr = fn.invokeHR(arrayOf(__251602621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentObjectKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Collection(): TargetedContentCollection? {
      val fnPtr = _251602621_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentCollection>()
      val hr = fn.invokeHR(arrayOf(__251602621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Item(): TargetedContentItem? {
      val fnPtr = _251602621_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentItem>()
      val hr = fn.invokeHR(arrayOf(__251602621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Value(): TargetedContentValue? {
      val fnPtr = _251602621_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentValue>()
      val hr = fn.invokeHR(arrayOf(__251602621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentValue>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __251602621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("041d7969221242d19dfa88a8e3033aa3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentObject(ptr: Pointer?): WithDefault =
        ITargetedContentObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentObject {
      val address = segment.toRawLongValue()
      return makeITargetedContentObject(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__251602621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentObject): Array<ITargetedContentObject?> =
        (elements as
        Array<ITargetedContentObject?>).castToImpl<ITargetedContentObject,ITargetedContentObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentObject?> =
        arrayOfNulls<ITargetedContentObject_Impl>(size) as Array<ITargetedContentObject?>
  }
}
