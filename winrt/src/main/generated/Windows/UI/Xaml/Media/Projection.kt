package Windows.UI.Xaml.Media

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Media.IProjectionFactory.ABI.IID
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

@ABIMarker(Projection.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Projection;{b3443557-7f39-4d04-a89c-844338cac897})")
@WinRTByReference(brClass = Projection.ByReference::class)
public open class Projection(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IProjection.WithDefault, IWinRTObject {
  private val __1059548853_Interface: IProjection.WithDefault by lazy {
    as_1059548853()
  }


  public override val __1059548853_Ptr: JNAPointer? by lazy {
    __1059548853_Interface.__1059548853_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1059548853_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1059548853(): IProjection.WithDefault {
    if(pointer == NULL) {
      return(IProjection.ABI.makeIProjection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProjection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProjection.ABI.makeIProjection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Projection> {
    public override fun getValue() = Projection(pointer.getPointer(0))

    public fun setValue(value: Projection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Projection, MemoryAddress> {
    public val IProjectionFactory_Instance: IProjectionFactory by lazy {
      createIProjectionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProjectionFactory(): IProjectionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Projection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProjectionFactory.ABI.makeIProjectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IProjectionFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Projection {
      val address = segment.toRawLongValue()
      return Projection(Pointer(address))
    }

    public override fun toNative(obj: Projection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
