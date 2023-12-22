package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.Documents.IBlockFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(Block.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.Block;{8149d507-672f-5fd5-a10a-351389ba9659})")
@WinRTByReference(brClass = Block.ByReference::class)
public open class Block(
  ptr: JNAPointer? = NULL
) : TextElement(ptr), IBlock.WithDefault, IWinRTObject {
  private val __1715039440_Interface: IBlock.WithDefault by lazy {
    as_1715039440()
  }


  public override val __1715039440_Ptr: JNAPointer? by lazy {
    __1715039440_Interface.__1715039440_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1715039440_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1715039440(): IBlock.WithDefault {
    if(pointer == NULL) {
      return(IBlock.ABI.makeIBlock(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBlock>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBlock.ABI.makeIBlock(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Block> {
    public override fun getValue() = Block(pointer.getPointer(0))

    public fun setValue(value: Block): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Block, MemoryAddress> {
    public val IBlockStatics_Instance: IBlockStatics by lazy {
      createIBlockStatics()
    }


    public val IBlockFactory_Instance: IBlockFactory by lazy {
      createIBlockFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBlockStatics(): IBlockStatics {
      val refiid = Guid.REFIID(IBlockStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Block".toHandle(),refiid,interfacePtr)
      val result = IBlockStatics.ABI.makeIBlockStatics(interfacePtr.value)
      return result
    }

    public fun createIBlockFactory(): IBlockFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Block".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBlockFactory.ABI.makeIBlockFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBlockFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Block {
      val address = segment.toRawLongValue()
      return Block(Pointer(address))
    }

    public override fun toNative(obj: Block): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TextAlignmentProperty() = ABI.IBlockStatics_Instance.get_TextAlignmentProperty()

    public fun get_HorizontalTextAlignmentProperty() =
        ABI.IBlockStatics_Instance.get_HorizontalTextAlignmentProperty()

    public fun get_LineHeightProperty() = ABI.IBlockStatics_Instance.get_LineHeightProperty()

    public fun get_LineStackingStrategyProperty() =
        ABI.IBlockStatics_Instance.get_LineStackingStrategyProperty()

    public fun get_MarginProperty() = ABI.IBlockStatics_Instance.get_MarginProperty()
  }
}
