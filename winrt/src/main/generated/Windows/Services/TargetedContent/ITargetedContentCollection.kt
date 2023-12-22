package Windows.Services.TargetedContent

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(ITargetedContentCollection.ABI::class)
@Signature("{2d4b66c5-f163-44ba-9f6e-e1a4c2bb559d}")
@Guid("2d4b66c5f16344ba9f6ee1a4c2bb559d")
@WinRTInterface("2d4b66c5f16344ba9f6ee1a4c2bb559d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentCollection.ByReference::class)
public interface ITargetedContentCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun ReportInteraction(interaction: TargetedContentInteraction?): Unit

  @InterfaceMethod(2)
  public fun ReportCustomInteraction(customInteractionName: String?): Unit

  @InterfaceMethod(3)
  public fun get_Path(): String?

  @InterfaceMethod(4)
  public fun get_Properties(): IMapView<String?, TargetedContentValue?>?

  @InterfaceMethod(5)
  public fun get_Collections(): IVectorView<TargetedContentCollection?>?

  @InterfaceMethod(6)
  public fun get_Items(): IVectorView<TargetedContentItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentCollection> {
    public override fun getValue() = ABI.makeITargetedContentCollection(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentCollection {
    public val __1084013918_Ptr: Pointer?

    public val _1084013918_VtblPtr: Pointer?
      get() = __1084013918_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1084013918_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1084013918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportInteraction(interaction: TargetedContentInteraction?): Unit {
      val fnPtr = _1084013918_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1084013918_Ptr, marshalToNative(interaction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ReportCustomInteraction(customInteractionName: String?): Unit {
      val fnPtr = _1084013918_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1084013918_Ptr, marshalToNative(customInteractionName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Path(): String? {
      val fnPtr = _1084013918_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1084013918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Properties(): IMapView<String?, TargetedContentValue?>? {
      val fnPtr = _1084013918_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, TargetedContentValue?>>()
      val hr = fn.invokeHR(arrayOf(__1084013918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          TargetedContentValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Collections(): IVectorView<TargetedContentCollection?>? {
      val fnPtr = _1084013918_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TargetedContentCollection?>>()
      val hr = fn.invokeHR(arrayOf(__1084013918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<TargetedContentCollection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Items(): IVectorView<TargetedContentItem?>? {
      val fnPtr = _1084013918_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TargetedContentItem?>>()
      val hr = fn.invokeHR(arrayOf(__1084013918_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TargetedContentItem?>>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1084013918_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d4b66c5f16344ba9f6ee1a4c2bb559d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentCollection(ptr: Pointer?): WithDefault =
        ITargetedContentCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentCollection {
      val address = segment.toRawLongValue()
      return makeITargetedContentCollection(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1084013918_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentCollection):
        Array<ITargetedContentCollection?> = (elements as
        Array<ITargetedContentCollection?>).castToImpl<ITargetedContentCollection,ITargetedContentCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentCollection?> =
        arrayOfNulls<ITargetedContentCollection_Impl>(size) as Array<ITargetedContentCollection?>
  }
}
