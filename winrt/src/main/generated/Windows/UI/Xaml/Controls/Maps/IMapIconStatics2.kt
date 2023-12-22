package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IMapIconStatics2.ABI::class)
@Signature("{ff4c306a-cf76-46ab-a12f-b603b986c696}")
@Guid("ff4c306acf7646aba12fb603b986c696")
@WinRTInterface("ff4c306acf7646aba12fb603b986c696")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapIconStatics2.ByReference::class)
public interface IMapIconStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CollisionBehaviorDesiredProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapIconStatics2> {
    public override fun getValue() = ABI.makeIMapIconStatics2(pointer.getPointer(0))

    public fun setValue(value: IMapIconStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapIconStatics2 {
    public val __1767561551_Ptr: Pointer?

    public val _1767561551_VtblPtr: Pointer?
      get() = __1767561551_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CollisionBehaviorDesiredProperty(): DependencyProperty? {
      val fnPtr = _1767561551_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1767561551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapIconStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767561551_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapIconStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff4c306acf7646aba12fb603b986c696")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapIconStatics2(ptr: Pointer?): WithDefault = IMapIconStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapIconStatics2 {
      val address = segment.toRawLongValue()
      return makeIMapIconStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMapIconStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767561551_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapIconStatics2): Array<IMapIconStatics2?> = (elements as
        Array<IMapIconStatics2?>).castToImpl<IMapIconStatics2,IMapIconStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapIconStatics2?> =
        arrayOfNulls<IMapIconStatics2_Impl>(size) as Array<IMapIconStatics2?>
  }
}
