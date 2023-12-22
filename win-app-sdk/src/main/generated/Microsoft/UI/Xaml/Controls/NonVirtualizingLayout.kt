package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.INonVirtualizingLayoutFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NonVirtualizingLayout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NonVirtualizingLayout;{0c24defd-f68f-51d9-998e-4cbad48be012})")
@WinRTByReference(brClass = NonVirtualizingLayout.ByReference::class)
public open class NonVirtualizingLayout(
  ptr: JNAPointer? = NULL
) : Layout(ptr), INonVirtualizingLayout.WithDefault, INonVirtualizingLayoutOverrides.WithDefault,
    IWinRTObject {
  private val __853608970_Interface: INonVirtualizingLayout.WithDefault by lazy {
    as_853608970()
  }


  private val __1731583185_Interface: INonVirtualizingLayoutOverrides.WithDefault by lazy {
    as_1731583185()
  }


  public override val __853608970_Ptr: JNAPointer? by lazy {
    __853608970_Interface.__853608970_Ptr
  }


  public override val __1731583185_Ptr: JNAPointer? by lazy {
    __1731583185_Interface.__1731583185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__853608970_Interface, __1731583185_Interface)

  public constructor() : this(ABI.activate())

  private fun as_853608970(): INonVirtualizingLayout.WithDefault {
    if(pointer == NULL) {
      return(INonVirtualizingLayout.ABI.makeINonVirtualizingLayout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INonVirtualizingLayout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INonVirtualizingLayout.ABI.makeINonVirtualizingLayout(ref.value))
  }

  private fun as_1731583185(): INonVirtualizingLayoutOverrides.WithDefault {
    if(pointer == NULL) {
      return(INonVirtualizingLayoutOverrides.ABI.makeINonVirtualizingLayoutOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INonVirtualizingLayoutOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INonVirtualizingLayoutOverrides.ABI.makeINonVirtualizingLayoutOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NonVirtualizingLayout> {
    public override fun getValue() = NonVirtualizingLayout(pointer.getPointer(0))

    public fun setValue(value: NonVirtualizingLayout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NonVirtualizingLayout, MemoryAddress> {
    public val INonVirtualizingLayoutFactory_Instance: INonVirtualizingLayoutFactory by lazy {
      createINonVirtualizingLayoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINonVirtualizingLayoutFactory(): INonVirtualizingLayoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NonVirtualizingLayout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INonVirtualizingLayoutFactory.ABI.makeINonVirtualizingLayoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = INonVirtualizingLayoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NonVirtualizingLayout {
      val address = segment.toRawLongValue()
      return NonVirtualizingLayout(Pointer(address))
    }

    public override fun toNative(obj: NonVirtualizingLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
