package Windows.UI.WebUI.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUICommandBarSymbolIcon.ABI::class)
@Signature("{d4935477-fd26-46ed-8658-1a3f4400e7b3}")
@Guid("d4935477fd2646ed86581a3f4400e7b3")
@WinRTInterface("d4935477fd2646ed86581a3f4400e7b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarSymbolIcon.ByReference::class)
public interface IWebUICommandBarSymbolIcon : NativeMapped, IWinRTInterface, IWebUICommandBarIcon {
  @InterfaceMethod(0)
  public fun get_Symbol(): String?

  @InterfaceMethod(1)
  public fun put_Symbol(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarSymbolIcon> {
    public override fun getValue() = ABI.makeIWebUICommandBarSymbolIcon(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarSymbolIcon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarSymbolIcon, IWebUICommandBarIcon.WithDefault {
    public val __58894004_Ptr: Pointer?

    public val _58894004_VtblPtr: Pointer?
      get() = __58894004_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Symbol(): String? {
      val fnPtr = _58894004_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__58894004_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Symbol(value: String?): Unit {
      val fnPtr = _58894004_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__58894004_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebUICommandBarSymbolIcon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebUICommandBarIcon {
    public override val __1332685780_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_58894004_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __58894004_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarSymbolIcon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4935477fd2646ed86581a3f4400e7b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarSymbolIcon(ptr: Pointer?): WithDefault =
        IWebUICommandBarSymbolIcon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarSymbolIcon {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarSymbolIcon(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarSymbolIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__58894004_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarSymbolIcon):
        Array<IWebUICommandBarSymbolIcon?> = (elements as
        Array<IWebUICommandBarSymbolIcon?>).castToImpl<IWebUICommandBarSymbolIcon,IWebUICommandBarSymbolIcon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarSymbolIcon?> =
        arrayOfNulls<IWebUICommandBarSymbolIcon_Impl>(size) as Array<IWebUICommandBarSymbolIcon?>
  }
}
