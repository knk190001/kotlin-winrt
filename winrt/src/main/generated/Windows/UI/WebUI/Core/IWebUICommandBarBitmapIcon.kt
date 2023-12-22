package Windows.UI.WebUI.Core

import Windows.Foundation.Uri
import Windows.UI.WebUI.Core.IWebUICommandBarIcon.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IWebUICommandBarBitmapIcon.ABI::class)
@Signature("{858f4f45-08d8-4a46-81ec-00015b0b1c6c}")
@Guid("858f4f4508d84a4681ec00015b0b1c6c")
@WinRTInterface("858f4f4508d84a4681ec00015b0b1c6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarBitmapIcon.ByReference::class)
public interface IWebUICommandBarBitmapIcon : NativeMapped, IWinRTInterface, IWebUICommandBarIcon {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun put_Uri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarBitmapIcon> {
    public override fun getValue() = ABI.makeIWebUICommandBarBitmapIcon(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarBitmapIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarBitmapIcon, IWebUICommandBarIcon.WithDefault {
    public val __2068369053_Ptr: Pointer?

    public val _2068369053_VtblPtr: Pointer?
      get() = __2068369053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _2068369053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2068369053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Uri(value: Uri?): Unit {
      val fnPtr = _2068369053_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2068369053_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUICommandBarBitmapIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebUICommandBarIcon {
    public override val __1332685780_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2068369053_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2068369053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarBitmapIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("858f4f4508d84a4681ec00015b0b1c6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarBitmapIcon(ptr: Pointer?): WithDefault =
        IWebUICommandBarBitmapIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarBitmapIcon {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarBitmapIcon(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarBitmapIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2068369053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarBitmapIcon):
        Array<IWebUICommandBarBitmapIcon?> = (elements as
        Array<IWebUICommandBarBitmapIcon?>).castToImpl<IWebUICommandBarBitmapIcon,IWebUICommandBarBitmapIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarBitmapIcon?> =
        arrayOfNulls<IWebUICommandBarBitmapIcon_Impl>(size) as Array<IWebUICommandBarBitmapIcon?>
  }
}
