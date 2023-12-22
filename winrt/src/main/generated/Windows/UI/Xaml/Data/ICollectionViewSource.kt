package Windows.UI.Xaml.Data

import Windows.UI.Xaml.PropertyPath
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICollectionViewSource.ABI::class)
@Signature("{a66a1146-d2fb-4ead-be9f-3578a466dcfe}")
@Guid("a66a1146d2fb4eadbe9f3578a466dcfe")
@WinRTInterface("a66a1146d2fb4eadbe9f3578a466dcfe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICollectionViewSource.ByReference::class)
public interface ICollectionViewSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Source(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_View(): ICollectionView?

  @InterfaceMethod(3)
  public fun get_IsSourceGrouped(): Boolean

  @InterfaceMethod(4)
  public fun put_IsSourceGrouped(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_ItemsPath(): PropertyPath?

  @InterfaceMethod(6)
  public fun put_ItemsPath(value: PropertyPath?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICollectionViewSource> {
    public override fun getValue() = ABI.makeICollectionViewSource(pointer.getPointer(0))

    public fun setValue(value: ICollectionViewSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICollectionViewSource {
    public val __1042872698_Ptr: Pointer?

    public val _1042872698_VtblPtr: Pointer?
      get() = __1042872698_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): IUnknown? {
      val fnPtr = _1042872698_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1042872698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: IUnknown?): Unit {
      val fnPtr = _1042872698_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1042872698_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_View(): ICollectionView? {
      val fnPtr = _1042872698_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICollectionView>()
      val hr = fn.invokeHR(arrayOf(__1042872698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICollectionView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsSourceGrouped(): Boolean {
      val fnPtr = _1042872698_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1042872698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsSourceGrouped(value: Boolean): Unit {
      val fnPtr = _1042872698_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1042872698_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ItemsPath(): PropertyPath? {
      val fnPtr = _1042872698_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyPath>()
      val hr = fn.invokeHR(arrayOf(__1042872698_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ItemsPath(value: PropertyPath?): Unit {
      val fnPtr = _1042872698_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1042872698_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICollectionViewSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1042872698_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICollectionViewSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a66a1146d2fb4eadbe9f3578a466dcfe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICollectionViewSource(ptr: Pointer?): WithDefault =
        ICollectionViewSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICollectionViewSource {
      val address = segment.toRawLongValue()
      return makeICollectionViewSource(Pointer(address))
    }

    public override fun toNative(obj: ICollectionViewSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1042872698_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICollectionViewSource): Array<ICollectionViewSource?> =
        (elements as
        Array<ICollectionViewSource?>).castToImpl<ICollectionViewSource,ICollectionViewSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICollectionViewSource?> =
        arrayOfNulls<ICollectionViewSource_Impl>(size) as Array<ICollectionViewSource?>
  }
}
