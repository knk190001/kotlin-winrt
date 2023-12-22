package Windows.UI.Xaml.Controls.Maps

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMapElement3.ABI::class)
@Signature("{13efbc59-45ed-48b4-93ad-e3f78f8cf218}")
@Guid("13efbc5945ed48b493ade3f78f8cf218")
@WinRTInterface("13efbc5945ed48b493ade3f78f8cf218")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElement3.ByReference::class)
public interface IMapElement3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MapStyleSheetEntry(): String?

  @InterfaceMethod(1)
  public fun put_MapStyleSheetEntry(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_MapStyleSheetEntryState(): String?

  @InterfaceMethod(3)
  public fun put_MapStyleSheetEntryState(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Tag(): IUnknown?

  @InterfaceMethod(5)
  public fun put_Tag(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapElement3> {
    public override fun getValue() = ABI.makeIMapElement3(pointer.getPointer(0))

    public fun setValue(value: IMapElement3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElement3 {
    public val __1968925630_Ptr: Pointer?

    public val _1968925630_VtblPtr: Pointer?
      get() = __1968925630_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MapStyleSheetEntry(): String? {
      val fnPtr = _1968925630_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1968925630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MapStyleSheetEntry(value: String?): Unit {
      val fnPtr = _1968925630_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1968925630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MapStyleSheetEntryState(): String? {
      val fnPtr = _1968925630_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1968925630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MapStyleSheetEntryState(value: String?): Unit {
      val fnPtr = _1968925630_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1968925630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Tag(): IUnknown? {
      val fnPtr = _1968925630_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1968925630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Tag(value: IUnknown?): Unit {
      val fnPtr = _1968925630_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1968925630_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapElement3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1968925630_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElement3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13efbc5945ed48b493ade3f78f8cf218")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElement3(ptr: Pointer?): WithDefault = IMapElement3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElement3 {
      val address = segment.toRawLongValue()
      return makeIMapElement3(Pointer(address))
    }

    public override fun toNative(obj: IMapElement3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1968925630_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElement3): Array<IMapElement3?> = (elements as
        Array<IMapElement3?>).castToImpl<IMapElement3,IMapElement3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElement3?> =
        arrayOfNulls<IMapElement3_Impl>(size) as Array<IMapElement3?>
  }
}
