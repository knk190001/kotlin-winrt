package Microsoft.UI.Xaml.Controls

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUIElementCollection.ABI::class)
@Signature("{23050cb1-db88-54ed-9083-5ecfb12512fd}")
@Guid("23050cb1db8854ed90835ecfb12512fd")
@WinRTInterface("23050cb1db8854ed90835ecfb12512fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementCollection.ByReference::class)
public interface IUIElementCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Move(oldIndex: WinDef.UINT, newIndex: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementCollection> {
    public override fun getValue() = ABI.makeIUIElementCollection(pointer.getPointer(0))

    public fun setValue(value: IUIElementCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementCollection {
    public val __642399615_Ptr: Pointer?

    public val _642399615_VtblPtr: Pointer?
      get() = __642399615_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Move(oldIndex: WinDef.UINT, newIndex: WinDef.UINT): Unit {
      val fnPtr = _642399615_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__642399615_Ptr, oldIndex, newIndex,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElementCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __642399615_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23050cb1db8854ed90835ecfb12512fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementCollection(ptr: Pointer?): WithDefault = IUIElementCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementCollection {
      val address = segment.toRawLongValue()
      return makeIUIElementCollection(Pointer(address))
    }

    public override fun toNative(obj: IUIElementCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__642399615_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementCollection): Array<IUIElementCollection?> =
        (elements as
        Array<IUIElementCollection?>).castToImpl<IUIElementCollection,IUIElementCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementCollection?> =
        arrayOfNulls<IUIElementCollection_Impl>(size) as Array<IUIElementCollection?>
  }
}
